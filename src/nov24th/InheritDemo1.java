package nov24th;

public class InheritDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Student s1=new Student();
		//Marks s1=new Marks();
		Leave s1=new Leave();
		s1.setDetails(1, "John");
		s1.getDetails();
		s1.setMarks(70, 80, 90);
		s1.getMarks();
		s1.setLeaves(5, 10);
		s1.getLeaves();

	}

}
