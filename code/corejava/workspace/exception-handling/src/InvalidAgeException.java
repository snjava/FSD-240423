
/*
 * Steps to create Custom Exception
 * 1. Create a class
 * 2. Extends any Exception class.
 * 3. Provide Exception impl in the class
 */
public class InvalidAgeException extends RuntimeException {
	String m;
	InvalidAgeException(String m) {
		super(m);
		this.m = m;
	}
}
