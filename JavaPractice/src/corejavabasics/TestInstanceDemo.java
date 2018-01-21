package corejavabasics;

public class TestInstanceDemo {

	public static void main(String[] args) {
		//before executing constructor, instance context(e.g can be instance methods or instance variables or blocks is checked and initialised by jvm in that particular class
		// order of instance context is checked in top to bottom whichever instance elements comes first can be anything
		
		//InstanceDemo demoobj= new InstanceDemo();
		
		InstanceDemo1 demo1obj = new InstanceDemo1();
		
		InstanceDemo1 demo2obj = new InstanceDemo1();
		
		/*expected o/p
		* inside instance block
		* inside m2 method
		* inside InstanceDemo1 constructor
		* inside instance block
		* inside m2 method
		* inside InstanceDemo1 constructor	
		*/

	}

}
