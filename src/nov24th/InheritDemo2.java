package nov24th;

public class InheritDemo2 {

	public static void main(String[] args) {
		
		//Sum obj1=new Sum();
		//Sub obj1=new Sub();
		//Mul obj1=new Mul();
		Div obj1=new Div();
		obj1.setX(10);
		obj1.setY(20);
		//obj1.add();
		//obj1.diff();
		//obj1.prod();
		obj1.quot();
		
		Sum obj2=new Sum();
		obj2.setX(10);
		obj2.setY(20);
		obj2.add();
	}

}
