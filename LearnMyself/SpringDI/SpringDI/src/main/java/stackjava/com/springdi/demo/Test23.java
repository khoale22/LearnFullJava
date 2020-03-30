package stackjava.com.springdi.demo;

import org.springframework.stereotype.Component;

@Component
public class Test23 {
	private String message = "rewr";
	private String message22;

	public Test23() {
	}

	public void show(){
		System.out.println("This is a test class");
	}

	public Test23(String message, String message22) {
		//this.setMessage(message); nhu nhau
		this.message = message;
		this.message22 = message22;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void print() {
		System.out.println("Print: " + this.getMessage() +" " + this.getMessage22());
	}

	public String getMessage22() {
		return message22;
	}

	public void setMessage22(String message22) {
		this.message22 = message22;
	}
}