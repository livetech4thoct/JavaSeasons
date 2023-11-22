package nov22nd;

public class ClockTest {

	public static void main(String[] args) {
		
		Clock c1=new Clock();
		c1.setClock(11);
		c1.getClock();
		
		c1.setClock(2, 30, 45);
		c1.getClock();
		
		c1.setClock(2, 30, 45,"am");
		c1.getClock();
		

	}

}
