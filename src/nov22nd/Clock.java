package nov22nd;

public class Clock {
	
	int hr,min,sec;
	String time;
	
	public void setClock(int hr)
	{
		this.hr=hr;
	}
	
	public void setClock(int hr,int min)
	{
		this.hr=hr;
		this.min=min;
	}
	
	public void setClock(int hr,int min,int sec)
	{
		this.hr=hr;
		this.min=min;
		this.sec=sec;
	}
	
	public void setClock(int hr,int min,int sec,String time)
	{
		this.hr=hr;
		this.min=min;
		this.sec=sec;
		this.time=time;
		
	}
	
	public void getClock()
	{
		System.out.format("%02d:%02d:%02d %s",hr,min,sec,time);
		System.out.println();
	}

}
