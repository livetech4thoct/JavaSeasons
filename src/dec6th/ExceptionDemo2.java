package dec6th;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		
		System.out.println("Enter some value for x : ");
		
		Scanner input=new Scanner(System.in);
		
		try
		{
		int x=input.nextInt();
		
		System.out.println("value of x is "+x);
		}
		catch(InputMismatchException e1)
		{
			System.out.println(e1.getMessage());
		}
		catch(RuntimeException e2)
		{
			System.out.println(e2.getMessage());
		}
		catch(Exception e3)
		{
			System.out.println(e3.getMessage());
		}
		
		
		System.out.println("End of program...");
		

	}

}
