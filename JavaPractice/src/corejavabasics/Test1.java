package corejavabasics;

public class Test1 {
	
	//2 instance variable
	int studentAge= 10;
	int studentRollNo= 21;
	
	
	static void m1(){
		Test1 t1= new Test1();
		System.out.println(t1.studentAge);
		
	}
	static void m2(){
		Test1 t1= new Test1();
		System.out.println(t1.studentRollNo);
	}
	public static void main(String[]args){
		Test1.m1();
		Test1.m2();
		
		
	}

}
