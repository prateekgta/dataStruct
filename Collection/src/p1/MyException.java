package p1;


public class MyException extends Exception {
	
	public MyException(String msg) {
		super(msg);
	}

	@Override
	public String toString() {
		return "Age Limit Is > 18";
	}
	
	

}
