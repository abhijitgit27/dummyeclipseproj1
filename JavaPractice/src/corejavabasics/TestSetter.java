package corejavabasics;

public class TestSetter {

	public static void main(String[] args) {
		
		SetterGetter sg = new SetterGetter();
		
		sg.setUName("abc");
		sg.setUpassword("abc1234");
		
		System.out.println("Username:"+sg.getUname());
		System.out.println("Password:"+sg.getUpassword());

	}

}
