package user.dao;

import java.util.List;
import java.util.Map;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;

import lombok.Setter;
import user.bean.UserDTO;

/*
 * public class UserDAOImpl implements UserDAO {
 * 
 * @Setter private JdbcTemplate jdbcTemplate;
 * 
 * @Override public void write(UserDTO userDTO) { String
 * sql="insert into usertable values(?,?,?)"; jdbcTemplate.update(sql,
 * userDTO.getName(), userDTO.getId(), userDTO.getPwd()); //템플릿에서 인서트가 따로 없다
 * //update(String sql, Object....) .의 의미는 매개변수 개수가 상관없다는 것이다.
 * //jdbcTemplate.update() > insert/update/delete }
 * 
 * @Override public List<UserDTO> getUserList() { String
 * sql="select * from usertable"; //jdbcTemplate.queryForObject//한줄만 return
 * jdbcTemplate.query(sql, new BeanPropertyRowMapper<UserDTO>(UserDTO.class));
 * //기본값이 object라서 타입 설정 필요 }
 * 
 * }
 */

public class UserDAOImpl extends JdbcDaoSupport implements UserDAO {
	//@Setter JdbcDao안에 이미 존재
	private JdbcTemplate jdbcTemplate;

	@Override
	public void write(UserDTO userDTO) {
		String sql="insert into usertable values(?,?,?)";
		getJdbcTemplate().update(sql, userDTO.getName(), userDTO.getId(), userDTO.getPwd());
		//템플릿에서 인서트가 따로 없다
		//update(String sql, Object....) .의 의미는 매개변수 개수가 상관없다는 것이다.
		//jdbcTemplate.update() > insert/update/delete
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
		String sql="select * from usertable where id=?";
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
		String sql="update usertable set name=?, pwd=? where id=?";
		getJdbcTemplate().update(sql, map.get("name"), map.get("pwd"), map.get("id"));
		//순서 맞춰줘야 함
		//커밋도 해줌
	
	}

	@Override
	public void deleteUser(String id) {
		String sql="delete from usertable where id =?";
		getJdbcTemplate().update(sql,id);
		
	}



}
