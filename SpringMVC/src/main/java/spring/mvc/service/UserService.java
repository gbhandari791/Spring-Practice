package spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import spring.mvc.dao.UserDao;
import spring.mvc.entity.User;
import spring.mvc.form.LoginForm;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public int createUser(LoginForm loginForm) {
		
		User user = new User();
		user.setUserName(loginForm.getUserName());
		user.setPassWord(loginForm.getPassWord());
		user.setAge(loginForm.getAge());
		
		return this.userDao.saveUser(user);
	}
}
