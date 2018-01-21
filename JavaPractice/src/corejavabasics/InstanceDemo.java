package corejavabasics;

public class InstanceDemo {

	//instance variable
	int i= m1();
	
	public InstanceDemo() {
		System.out.println("Inside Instance Demo constructor");
	}
	
	//used to initialised initialise instance variable
	int m1(){
		System.out.println("inside method m1");
		return 10;
	}
	
	//instance blocks
	{
	 System.out.println("inside instance blocks");
	 
	}
	
}
