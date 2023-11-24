package nov24th;

public class Leave extends Marks {
	
	int cl,sl;
	
	public void setLeaves(int cl,int sl)
	{
		this.cl=cl;
		this.sl=sl;
		
	}
	
	public void getLeaves()
	{
		System.out.println("Total Leaves "+(sl+cl));
	}

}
