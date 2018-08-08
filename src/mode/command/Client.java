package mode.command;

public class Client {
	public static void main(String[] args) {
		Invoker invoker = new Invoker();
		invoker.excute("T800");
		invoker.excute("T900");
		invoker.excute("T700");
	}
}
