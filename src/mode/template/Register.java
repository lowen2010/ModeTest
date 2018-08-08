package mode.template;

public class Register extends RegisterTemplate {

	@Override
	public void prcess() {
		System.out.println("保存用户数据");
	}

	public static void main(String[] args) {
		Register reg = new Register();
		reg.exec();		
	}

}
