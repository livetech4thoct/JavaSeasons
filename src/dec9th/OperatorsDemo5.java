package dec9th;

import java.util.Scanner;

public class OperatorsDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter value for x ");
		int x=input.nextInt();
		System.out.println("Enter value for y ");
		int y=input.nextInt();
		
		//String status=(x>y)? "x is bigger" : "x is smaller";
		//System.out.println(status);
		
		System.out.println((x>y)? "x is bigger" : "x is smaller");
		
		

	}

}
