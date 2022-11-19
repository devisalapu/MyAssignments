package language;

public class Automation extends MultipleLanguage implements Language, TestTool  {

	public void selenium() {
		
		System.out.println("Selenium from TestTool interface");
	}

	public void java() {
		System.out.println("Java from Language interface");
		
	}

	public void ruby() {
		System.out.println("Ruby from MultipleLanguage abstract class");
		
	}
	
	public static void main(String[] args) {
		
		Automation auto = new Automation();
		auto.selenium();
		auto.java();
		auto.ruby();
		auto.python();
	}

}
