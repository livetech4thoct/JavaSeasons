package nov18th;

public class MethodsDemo2 {

	public static void main(String[] args) {
		
		MethodsDemo2 obj1=new MethodsDemo2();
		obj1.natSum(5);
		obj1.natSum(10);
		obj1.natSum(100);

	}
	
	public void natSum(int n)
	{
		int res=0;
		
		res=n*(n+1)/2;
		
		System.out.println("Sum of "+n+" natural numbers is "+res);
		
	}

}
