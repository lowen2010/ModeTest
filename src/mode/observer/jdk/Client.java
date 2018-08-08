package mode.observer.jdk;

public class Client {

	public static void main(String[] args) {
		MessTarget messTarget = new MessTarget();
		User1 user1 = new User1(messTarget);
		User2 user2 = new User2(messTarget);
		messTarget.setMessage("你好");
		System.out.println("==============================");
		messTarget.deleteObserver(user1);
		messTarget.setMessage("hello");
		System.out.println("==============================");
		messTarget.deleteObserver(user2);
		messTarget.setMessage("test");
	}

}
