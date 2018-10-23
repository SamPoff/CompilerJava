package src;

/**
 * @author sp31485
 *<p>
 *This class takes the rules, tokens, and priorities described in the GenRules
 *class and encapsulates them in a single object. A token can be thought of like
 *a struct which contains one rule, one token, and one priority level.
 *</p>
 */
public class Token {

	private String rule;
	private String token;
	private int priority;
	
	public Token() {
		// Empty like my heart.
	}
	
	/**
	 * Constructor; applies values to the class attributes. 
	 * @param s1 rule
	 * @param s2 token
	 * @param i priority
	 */
	public Token( String s1, String s2, int i ) {
		rule = s1;
		token = s2;
		priority = i;
	}

	/**
	 * Takes in arguments to construct a token and generates one
	 * using the constructor. Once generated it is returned to 
	 * wherever it was called from. 
	 * @param s1
	 * @param s2
	 * @param i
	 * @return Returns a formed token object.
	 */
	public static Token makeToken( String s1, String s2, int i ) {
		Token t = new Token( s1, s2, i );
		return t;
	}
	
	/**
	 * Returns the rule from a Token.
	 * @param t
	 * @return
	 */
	public static String getRule( Token t ) {
		return t.rule.toString();
	}
	
	/**
	 * Returns the 'token' from a Token.
	 * @param t
	 * @return
	 */
	public static String getToken( Token t ) {
		return t.token.toString();
	}
	
	/**
	 * Returns the priority value from a Token.
	 * @param t
	 * @return
	 */
	public static String getPriority( Token t ) {
		return String.valueOf( t.priority );
	}
	
	/**
	 * Will print out the rule, token, and priority values given
	 * an array of tokens. 
	 * @param t
	 */
	public static void printTokens( Token[] ti ) {
		for( Token t : ti ) {
			System.out.print( t.getRule( t ) + " " );
			System.out.print( t.getToken( t ) + " " );
			System.out.print( t.getPriority( t ) + "\n" );
		}
	}

}
