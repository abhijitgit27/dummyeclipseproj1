package corejavabasics;

public class Test2 {

	int a;
	int b;
	
	static long l1;
	static float f1;
	
	Test2 t= new Test2();
	
	void m1(){
		System.out.println(a);
		System.out.println(b);
		System.out.println(Test2.l1);
		System.out.println(Test2.f1);
		
	}
	
	static void m2(){
		Test2 t2= new Test2();
		System.out.println(t2.a);
		System.out.println(t2.b);
		System.out.println(l1);
		System.out.println(Test2.f1);
	
	}
	public static void main(String[] args){
		Test2 t2= new Test2();
		t2.m1();
		m2();
	}
	
}
