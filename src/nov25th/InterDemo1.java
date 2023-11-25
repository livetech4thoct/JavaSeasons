package nov25th;

public class InterDemo1 {

	public static void main(String[] args) {
		
		//  new MyInter();    Cannot instantiate the type MyInter
		
		MyInter obj=new MyClass();
		
		obj.display(100);
		obj.greet();
		System.out.println(MyInter.PI);

	}

}
