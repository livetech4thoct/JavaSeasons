package dec6th;

import java.util.Scanner;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		
		System.out.println("Enter some string ");
		
		Scanner sc=new Scanner(System.in);
		
		String str=sc.next();
		try
		{
		System.out.println(str.charAt(2));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("I'm in finaly block ..");
		}
		
		System.out.println("End of program...");

	}

}
