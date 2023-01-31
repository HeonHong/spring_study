package user.service;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import user.bean.UserDTO;
import user.dao.UserDAO;


@Service
public class UserInsertService implements UserService {
	
	@Autowired
	private UserDTO userDTO;
	@Autowired
	private UserDAO userDAO;
	
	
	@Override
	public void execute() {
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		
		//데이터
		System.out.print("이름을 입력하세요 : ");
		String name = scanner.next();
		System.out.print("아이디를 입력하세요 : ");
		String id = scanner.next();
		System.out.print("비밀번호를 입력하세요 : ");
		String pwd = scanner.next();
		
		//UserDTO userDTO = new UserDTO();
		userDTO.setId(id);
		userDTO.setName(name);
		userDTO.setPwd(pwd);
		
		//DB
		//UserDAO userDAO = new UserDAOImpl();
		userDAO.write(userDTO);
		
		//응답
		System.out.println(name + "님의 정보가 입력되었습니다.");
		
	}

}
