package dec7th;

public class InvalidAgeException extends RuntimeException{
	
	public InvalidAgeException()
	{
		super("Not Eligible for voting..");
	}

}
