package assignments;

public class SimpleInterest1 {

	public static void main(String[] args) {
		
		//using non-static method having no return-type 
		
		SimpleInterest1 obj1=new SimpleInterest1();
		
		obj1.calculateSimpleInterest1(10000, 1, 10);
		
		//using non-static method having return-type 
		
		double y=obj1.calculateSimpleInterest2(20000, 1, 10);
		
		System.out.println(y);
		
		//using static method having no return-type 
		
		SimpleInterest1.calculateSimpleInterest3(30000, 1, 10);
		
		
		//using static method having return-type 
		
		System.out.println(SimpleInterest1.calculateSimpleInterest4(40000, 1, 10));

	}
	
	public void calculateSimpleInterest1(double p,int t,double r)
	{
		double simpleInterest=(p*t*r)/100;
		
		System.out.println("Simple interest "+simpleInterest);
	}
	
	public double calculateSimpleInterest2(double p,int t,double r)
	{
		double simpleInterest=(p*t*r)/100;
		return simpleInterest;
		
	}
	
	public static void calculateSimpleInterest3(double p,int t,double r)
	{
		double simpleInterest=(p*t*r)/100;
		
		System.out.println("Simple interest "+simpleInterest);
	}
	
	public static double calculateSimpleInterest4(double p,int t,double r)
	{
		double simpleInterest=(p*t*r)/100;
		
		return simpleInterest;
	}

}
