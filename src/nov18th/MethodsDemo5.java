package nov18th;

public class MethodsDemo5 {

	public static void main(String[] args) {
		
		
		
	    System.out.println(MethodsDemo5.natSum(5));
	    
	    System.out.println(MethodsDemo5.natSum(10));
	    
	    System.out.println(MethodsDemo5.natSum(100));
		
	}
	
	public static int natSum(int n)
	{
		int res=0;
		
		res=n*(n+1)/2;
		
		return res;
		
	}

}
