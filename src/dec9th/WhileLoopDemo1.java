package dec9th;

import java.util.Scanner;

public class WhileLoopDemo1 {

	public static void main(String[] args) {
		
		boolean status=true;
		while(status)
		{
			
			System.out.println("enter some character ");
			
			Scanner input=new Scanner(System.in);
			
			String str=input.next();
			
			char ch=str.charAt(0);
			
			if(ch!='x')
			{
				System.out.println("you have entered "+ch+" character");
				status=true;
			}
			else
			{
				System.out.println("Exiting the loop ");
				//break;
				status=false;
			}
			
		}

	}

}
