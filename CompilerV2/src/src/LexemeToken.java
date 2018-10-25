package src;

public class LexemeToken {
	
	private String literal;
	private String token;
	private int priority;
	private int location = 0;
	
	public LexemeToken() {
		// Emptiness
	}
	
	public LexemeToken( String s1, String s2, int i, int i2 ) {
		literal = s1;
		token = s2;
		priority = i;
		location = i2;
	}
	
//	public LexemeToken() {
//		literal = literal;
//		token = token;
//		priority = priority;
//		location = location;
//	}

}
