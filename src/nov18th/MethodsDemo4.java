package nov18th;

public class MethodsDemo4 {

	public static void main(String[] args) {
		
		
		MethodsDemo4.natSum(5);
		MethodsDemo4.natSum(10);
		MethodsDemo4.natSum(100);

	}
	
	public static void natSum(int n)
	{
		int res=0;
		
		res=n*(n+1)/2;
		
		System.out.println("Sum of "+n+" natural numbers is "+res);
		
	}

}
