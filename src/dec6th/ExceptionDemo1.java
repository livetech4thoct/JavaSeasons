package dec6th;

import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Enter some value for x : ");
		Scanner input=new Scanner(System.in);
		//int x=10;
		int x=input.nextInt();
		
		System.out.println("Enter some value for y : ");
		//int y=2;
		int y=input.nextInt();
		
		//Thread.sleep(3000);
		
		try
		{
		int z=x/y;
		
		System.out.println("Quotient is "+z);
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
			e.printStackTrace();
			System.out.println("Please enter non-zero value for y ...");
		}
		
		System.out.println("End of Program...");

	}

}
