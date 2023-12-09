package dec9th;

import java.util.Scanner;

public class IfElseDemo3 {

	public static void main(String[] args) {
		
		System.out.println("Enter your Dept ");
		
		Scanner sc=new Scanner(System.in);
		
		String dept=sc.next();
		
		System.out.println("Enter your Salary :  ");
		
		Scanner input=new Scanner(System.in);
		
		double sal= input.nextInt();
		
		if(dept.equalsIgnoreCase("IT"))
		{
		if(sal>=50000)
		{
			sal=sal+sal*0.4;
		}
		else if(sal>=30000 && sal<50000)
		{
			//sal=sal+sal*0.3;
			sal+=sal*0.3;
		}
		else
		{
			sal=sal+sal*0.2;
		}
		}
		else
		{
			if(sal>=50000)
			{
				sal=sal+sal*0.3;
			}
			else if(sal>=30000 && sal<50000)
			{
				//sal=sal+sal*0.3;
				sal+=sal*0.2;
			}
			else
			{
				sal=sal+sal*0.1;
			}
			
		}
		System.out.println("Net Salary "+sal);

	}

}
