package dec4th;

public class ArraysDemo2 {

	public static void main(String[] args) {
		
		int[] arr=new int[5];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

		arr[0]=100;
		arr[2]=300;
		arr[4]=500;
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		arr[1]=200;
		arr[3]=400;
		//arr[5]=600;
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
		
		
	}

}
