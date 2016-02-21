package p1;

import java.util.Arrays;

public class AgeException extends Exception {

	public AgeException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AgeException :less than 18";
	}
}