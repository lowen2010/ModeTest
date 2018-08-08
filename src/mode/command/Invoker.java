package mode.command;

import java.util.HashMap;
import java.util.Map;

public class Invoker {
	private static Map<String,Command> map = new HashMap<String,Command>();
	static {
		map.put("T800", new T800Command());
		map.put("T900", new T900Command());
	}
	
	public void excute(String command) {
		Command curCommand = map.get(command);
		if(null != curCommand) {
			curCommand.excute();
		}else {
			System.out.println("不支持的命令");
		}
	}

}
