package dec9th;

import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args) {

		System.out.println("enter your birth month ");

		Scanner input = new Scanner(System.in);

		//int mon = input.nextInt();
		
		//byte mon=input.nextByte();
		
		//short mon=input.nextShort();
		
		//long mon=input.nextLong();
		
		//float mon=input.nextFloat();
		
		String str=input.next();
		
		char mon=str.charAt(0);

		String month = null;

		switch (mon) {

		case 1:
			month = "Jan";
			break;
		case '2':
			month = "Feb";
			break;
		case 3:
			month = "Mar";
			break;
		case 4:
			month = "Apr";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month = "Jun";
			break;
		case 7:
			month = "Jul";
			break;
		case 8:
			month = "Aug";
			break;
		case 9:
			month = "Sep";
			break;
		case 10:
			month = "Oct";
			break;
		case 11:
			month = "Nov";
			break;
		case 12:
			month = "Dec";
			break;
			default: System.out.println("not a valid month");
			

		}
		
		System.out.println("Month is "+month);

	}

}
