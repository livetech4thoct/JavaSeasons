package dec9th;

import java.util.Scanner;

public class SwitchDemo1 {

	public static void main(String[] args) {
		
		System.out.println("enter your birth month ");
		
		Scanner input=new Scanner(System.in);
		
		int mon=input.nextInt();
		
		String month=null;
		
		if(mon==1)
		{
			month="Jan";
		}
		else if(mon==2)
		{
			month="Feb";
		}
		else if(mon==3)
		{
			month="Mar";
		}
		else if(mon==4)
		{
			month="Apr";
		}
		else if(mon==5)
		{
			month="May";
		}
		else if(mon==6)
		{
			month="Jun";
		}
		else if(mon==7)
		{
			month="Jul";
		}
		else if(mon==8)
		{
			month="Aug";
		}
		else if(mon==9)
		{
			month="Sep";
		}
		else if(mon==10)
		{
			month="Oct";
		}
		else if(mon==11)
		{
			month="Nov";
		}
		else if(mon==12)
		{
			month="Dec";
		}
		else 
		{
			System.out.println("Invalid month...");
		}
		
		System.out.println("Month is "+month);

	}

}
