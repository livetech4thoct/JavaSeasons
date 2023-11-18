package nov18th;

public class MethodsDemo3 {

	public static void main(String[] args) {
		
		MethodsDemo3 obj1=new MethodsDemo3();
		
	    System.out.println(obj1.natSum(5));
	    
	    System.out.println(obj1.natSum(10));
	    
	    System.out.println(obj1.natSum(100));
		
	}
	
	public int natSum(int n)
	{
		int res=0;
		
		res=n*(n+1)/2;
		
		return res;
		
	}

}
