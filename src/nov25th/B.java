package nov25th;

public class B extends A {
	
	int x;
	
	public void putX(int x)
	{
		this.x=x;
	}
	
	public void setX(int x)
	{
		this.x=x;
	}
	
	public void showAll()
	{
		super.setX(10);
		System.out.println("x is "+super.x);
		System.out.println("x is "+this.x);
	}

}
