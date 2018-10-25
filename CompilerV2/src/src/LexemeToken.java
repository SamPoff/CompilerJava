package src;

/**
 * @author sp31485
 *Generates tokens with all the necessary information to parse an AST.
 */
public class LexemeToken extends Token {
	
	private String literal;
	private String token;
	private int priority;
	private int location = 0;
	
	/**
	 * Default constructor.
	 */
	public LexemeToken() {
		// Emptiness
	}
	
	/**
	 * Actual constructor, should contain all the values from original
	 * token plus literal value of regex's and locations of variables. 
	 * @param s1
	 * @param s2
	 * @param i
	 * @param i2
	 */
	public LexemeToken( String s1, String s2, int i, int i2 ) {
		literal = s1;
		token = s2;
		priority = i;
		location = i2;
	}

}
