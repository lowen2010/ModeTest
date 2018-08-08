package mode.observer.jdk;

import java.util.Observable;

public class MessTarget extends Observable {
	private String message = "";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		if(this.message != message) {
			this.message = message;
			this.setChanged();
			this.notifyObservers();
		}
	}

}
