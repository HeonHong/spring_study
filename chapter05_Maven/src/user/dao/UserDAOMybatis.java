package user.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import lombok.Setter;
import user.bean.UserDTO;

@Repository
@Transactional//AOP의 역할을 한다.commit과 close를 대신함. 원래는 메소드별로 작성해야하나 여기는 다 사용할 거라서 클래스에 검.
public class UserDAOMybatis implements UserDAO {

	
	//private SqlSessionFactory sqlSessionFactory;
	//여기서 생성자로 만들던가 아님 xml에서 만든다.
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public void write(UserDTO userDTO) {
		sqlSession.insert("userSQL.write",userDTO);

	}

	@Override
	public List<UserDTO> getUserList() {
		return sqlSession.selectList("userSQL.getList");
	}

	@Override
	public UserDTO getUser(String id) {
		
		return sqlSession.selectOne("userSQL.getUser", id);
	}

	@Override
	public void update(Map<String, String> map) {
		sqlSession.update("userSQL.update", map);
	}

	@Override
	public void deleteUser(String id) {
		sqlSession.delete("userSQL.delete", id);
	}

}
