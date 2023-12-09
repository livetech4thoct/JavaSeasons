package dec9th;

import java.util.Scanner;

public class DoWhileDemo1 {

	public static void main(String[] args) {
		
		int x=0;
		do
		{
			System.out.println("HOw many points you got in game ");
			Scanner input=new Scanner(System.in);
			
			x=input.nextInt();
			
			if(x!=0)
			{
				System.out.println("you have one more chance ");
			}
			else
			{
				System.out.println("NO more chance ..Game Exit");
			}
			
		}while(x>0);

	}

}
