package corejavabasics;

public class InstanceDemo1 {

	//instance blocks
	{
		System.out.println("inside instance block");
	}
	
	public InstanceDemo1() {
		System.out.println("inside InstanceDemo1 constructor");
	}
	
	//instance method
	int m2(){
		System.out.println("inside m2 method");
		return 10;
	}
	
	//instance variable
	int i= m2();
	
}
