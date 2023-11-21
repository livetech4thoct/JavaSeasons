package nov20th;

public class PersonDemo {

	public static void main(String[] args) {
		
		
		Person p1=new Person();
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.phone);
		p1.greet();
		
		p1.name="Sivamani";
		p1.age=30;
		p1.phone=9848022338l;
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.phone);
		p1.greet();
		Person.bye();
		
		Person p2=new Person();
		
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.phone);
		p2.greet();
		
		p2.name="DJ Tillu";
		p2.age=25;
		p2.phone=9696333222l;
		
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.phone);
		p2.greet();
		Person.bye();

	}

}
