package mode.template;

import java.util.UUID;

public abstract class RegisterTemplate {

	public final void genId() {
		System.out.println("生成id=" + UUID.randomUUID().toString());
	}
	
	public abstract void prcess(); 
	
	public final void genAward() {
		System.out.println("生成注册奖励");
	}
	
	public final void exec() {
		genId();
		prcess();
		genAward();
	}

}
