package p.com.example.spel;

public class GeneralUtil {

	public static final String STR_CONSTANT = "This is static variable";
	
	private String msg;
	
	public static int addition(int a, int b) {
		return a+b;
	}

	public GeneralUtil() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GeneralUtil(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
	
	
	
}
