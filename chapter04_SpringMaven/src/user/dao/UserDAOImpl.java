package user.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import lombok.Setter;
import user.bean.UserDTO;

@Repository
public class UserDAOImpl extends NamedParameterJdbcDaoSupport implements UserDAO {
	//public class UserDAOImpl extends JdbcDaoSupport implements UserDAO {
	
	//생성자로하면 굳이 안해줘도 된다.
	@Autowired
	public void setDS(DataSource dataSource) {
		setDataSource(dataSource);
		//굳이 부모에 보내는 이유는 getNamedParameterJdbcTemplate().update(sql, map); 이런 메소드까지 다 끌고 오지 않기위해서이다.
	}

	@Override
	public void write(UserDTO userDTO) {
		//String sql="insert into usertable values(?,?,?)";
		//getJdbcTemplate().update(sql, userDTO.getName(), userDTO.getId(), userDTO.getPwd());
		
		String sql="insert into usertable value(:name,:id,#{pwd})";
		
		Map<String, String> map = new HashMap<String,String>();
		map.put("name", userDTO.getName());
		map.put("id", userDTO.getId());
		map.put("pwd", userDTO.getPwd());
		//이 형식을 사용할 거면 꼭 userDTO로 사용해야한다.
		getNamedParameterJdbcTemplate().update(sql, map);
	}

	@Override
	public List<UserDTO> getUserList() {
		String sql="select * from usertable";
		//jdbcTemplate.queryForObject//한줄만
		return getJdbcTemplate().query(sql, new BeanPropertyRowMapper<UserDTO>(UserDTO.class));
		//기본값이 object라서 타입 설정 필요
		//UserDTO.class캐스팅이랑 같은 개념이다.
	}

	@Override
	public UserDTO getUser(String id) {
		String sql="select * from usertable where id=:id";
		try {
		
		return getJdbcTemplate().queryForObject(sql,
				new BeanPropertyRowMapper<UserDTO>(UserDTO.class), id);
		//rs와 동일한 역할을 한다!!
		}catch(EmptyResultDataAccessException e) {
			return null;
		}
	}

	@Override
	public void update(Map<String, String> map) {
		String sql="update usertable set name=:name, pwd=#{pwd} where id=:id";
		
		//둘 다 가능
		//getJdbcTemplate().update(sql, map.get("name"), map.get("pwd"), map.get("id"));
		//순서 맞춰줘야 함
		//커밋도 해줌
		getNamedParameterJdbcTemplate().update(sql, map);
	}

	@Override
	public void deleteUser(String id) {
		String sql="delete from usertable where id = :id";
		getJdbcTemplate().update(sql,id);
		
	}



}
