package p.com.example.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("testBean")
public class TestBean {

	// Literals (String, Integer, Double, Boolean, Character)
	@Value("#{10}")
	private int a;
	
	@Value("#{'Test'}")
	private String b;
	
	@Value("#{1.1}")
	private double c;
	
	@Value("#{true}")
	private boolean d;
	
	//  Mathematical & Logical Expressions
	@Value("#{1 + 1}")
	private int e;
	
	@Value("#{2 * 2}")
	private int f;
	
	@Value("#{true && false}")
	private boolean g;
	
	@Value("#{true || false}")
	private boolean h;
	
	// Ternary Expression
	@Value("#{10 > 20? 1 : 100}")
	private int j;
	
	// Static variables
	@Value("#{T(java.lang.Math).PI}")
	private double pi;
	
	@Value("#{ T(p.com.example.spel.GeneralUtil).STR_CONSTANT }")
	private String strVar;
	
	// Static Methods
	@Value("#{ T(java.lang.Math).sqrt(144) }")
	private double sqrRoot;
	
	@Value("#{ T(p.com.example.spel.GeneralUtil).addition(2,5) }")
	private int sumOfInt;
	
	// Object
	@Value("#{ new String('This is gaurav') }")
	private String myName;
	
	@Value("#{ new p.com.example.spel.GeneralUtil('This value is set by SpEL') }")
	private GeneralUtil util;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	public boolean isD() {
		return d;
	}
	public void setD(boolean d) {
		this.d = d;
	}
	public GeneralUtil getUtil() {
		return util;
	}
	public void setUtil(GeneralUtil util) {
		this.util = util;
	}
	@Override
	public String toString() {
		return "TestBean [pi=" + pi + ", strVar=" + strVar + ", sqrRoot=" + sqrRoot + ", sumOfInt=" + sumOfInt
				+ ", myName=" + myName + ", util=" + util + "]";
	}
	
	/*
	 * @Override public String toString() { return "TestBean [a=" + a + ", b=" + b +
	 * ", c=" + c + ", d=" + d + ", e=" + e + ", f=" + f + ", g=" + g + ", h=" + h +
	 * ", j=" + j + ", pi=" + pi + ", strVar=" + strVar + ", sqrRoot=" + sqrRoot +
	 * ", sumOfInt=" + sumOfInt + ", myName=" + myName + ", util=" + util + "]"; }
	 */
	
	
	
	
	
}
