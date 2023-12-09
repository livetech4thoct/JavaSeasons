package dec7th;

import java.util.Scanner;

public class VoterRegistrationForm {

	public static void main(String[] args) {
		
		
		System.out.println("Welcome to voter registration ...");
		
		System.out.println("Enter your age : ");
		
		Scanner input=new Scanner(System.in);
		
		int age=input.nextInt();
		
		if(age>=18)
		{
			System.out.println("Eligible for voting...Enter your details .. ");
		}
		else
		{
			try
			{
			throw new InvalidAgeException();
			}
			catch(InvalidAgeException e)
			{
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("End of Program ..");
	}

}
