package mode.observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class User1 implements Observer {
	
	public User1(MessTarget messTarget) {
		messTarget.addObserver(this);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		MessTarget messTarget = (MessTarget) arg0;
		System.out.println("user1 receive message change : message=" + messTarget.getMessage());
	}

}
