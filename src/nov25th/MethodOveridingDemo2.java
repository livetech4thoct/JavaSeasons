package nov25th;

public class MethodOveridingDemo2 {

	public static void main(String[] args) {
		
		//case 1
		
		//P obj1= new P();
		
		//case 2
		
		//C obj1=new C();
		
		//case 3
		
		P obj1=new C();
		
		//case 4
		
		//C obj1=new P();
		
		System.out.println(obj1.x);
		obj1.m1();

	}

}
