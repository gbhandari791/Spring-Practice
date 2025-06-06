package spring.mvc.form;

public class LoginForm {

	private String userName;
	private String passWord;
	private Integer age;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "LoginForm [userName=" + userName + ", passWord=" + passWord + ", age=" + age + "]";
	}
	
}
