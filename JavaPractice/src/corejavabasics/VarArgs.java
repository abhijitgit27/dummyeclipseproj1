package corejavabasics;

public class VarArgs {

	void add(int ... a){
		
		System.out.println("inside var args method");
		System.out.println("Number of arguments in var args method:" +a.length);
		
		int result=0;
		for(int i=0;i<a.length;i++){
		   
			System.out.print(a[i]+" ");
		    result= result +a[i];
		    
		}
		System.out.println();
		System.out.println("addition result is:" +result);
		
	}
	
	
}
