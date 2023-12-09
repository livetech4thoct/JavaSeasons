package dec9th;

import java.util.Scanner;

public class IfElseDemo1 {

	public static void main(String[] args) {
		
		System.out.println("Enter your Salary :  ");
		
		Scanner input=new Scanner(System.in);
		
		double sal= input.nextInt();
		
		if(sal >= 30000)
		{
			sal=sal+sal*(0.3);
		}
		else
		{
			sal=sal+sal*(0.2);
		}
		
		System.out.println("Net Salary "+sal);

	}

}
