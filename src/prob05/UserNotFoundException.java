package prob05;

public class UserNotFoundException extends Exception {
	public UserNotFoundException() {
		super();
		System.out.println("존재하지 않는 사용자입니다.");
	}
}
