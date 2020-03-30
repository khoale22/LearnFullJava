package stackjava.com.springdi.demo;

public class HelloWorld {
	private String message;
	private String message22;
	private String khoa = "khoale44";

	public HelloWorld() {
	}

	public HelloWorld(String message, String message22) {
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
		System.out.println("Print: " + this.getMessage() +" " + this.getMessage22()+ " " + this.getKhoa());
	}

	public String getMessage22() {
		return message22;
	}

	public void setMessage22(String message22) {
		this.message22 = message22;
	}

	public String getKhoa() {
		return khoa;
	}

	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}
}