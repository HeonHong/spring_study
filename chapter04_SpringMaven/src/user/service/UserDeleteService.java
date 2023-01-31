package user.service;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import lombok.Setter;
import user.bean.UserDTO;
import user.dao.UserDAO;


@Service
@Setter
public class UserDeleteService implements UserService {
	
	@Autowired
	private UserDAO userDAO;
	
	
	@Override
	public void execute() {
		
		/*
		 * 삭제 입력 찾는 거 없음
		 * 
		 * 삭제입력 수정했음
		 */
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("삭제할 id를 입력하세요.");
		String id = scanner.next();
		UserDTO userDTO = userDAO.getUser(id);
		
		if(userDTO==null) {
			System.out.println("돌아가거랏");
			return;
		}
		
		userDAO.deleteUser(id);
		System.out.println("지웠슈");
	}

}

/* 숙제 이거 다 메이븐으로 바꿔오셈. annotation spring config 사용할 것 */
/* spring config에는 datasource만 생성할 것. 다른 클래스는 @component 생성*/