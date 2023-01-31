package user.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Setter;
import user.bean.UserDTO;
import user.dao.UserDAO;

public class UserUpdateService implements UserService {
	@Setter
	private UserDAO userDAO;
	
	/*
	 * public void setUserDAO(UserDAO userDAO) { this.userDAO = userDAO; }
	 */
	@Override
	public void execute() {
		/*
		 * 수정할 아이디 입력 : 
		 * 찾을 아이디 없습니다.
		 * 
		 * 수정할 아이디 입력 :
		 * 수정할 이름 입력 
		 * 수정할 비밀번호 입력
		 */
		
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		
		//데이터
		System.out.print("수정할 아이디를 입력하세요 : ");
		String id = scanner.next();
		
		UserDTO userDTO = userDAO.getUser(id);
		if(userDTO==null) {
			System.out.println("겟아웃");
			return;
		}
		
		System.out.println(userDTO.getName() + "\t"
				+ userDTO.getId() + "\t"
				+ userDTO.getPwd() + "\t");
		
		
		System.out.println();
		System.out.print("수정할 이름을 입력하세요 : ");
		String name = scanner.next();
		System.out.print("수정할 비밀번호를 입력하세요 : ");
		String pwd = scanner.next();
		
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", name);
		map.put("id", id);
		map.put("pwd", pwd);
	
		userDAO.update(map);
		
		System.out.println("DB 수정 완료");
	}

}
