package src;

import java.util.LinkedList;
import java.util.List;

/**
 * @author sp31485
 *<p>
 *This class takes the rules, tokens, and priorities described in the GenRules
 *class and encapsulates them in a single object. A token can be thought of like
 *a struct which contains one rule, one token, and one priority level.
 *</p>
 */
public class Token extends GenRules {

	public String literal;
	public String token;
	public int priority;
	public boolean isRegex;
	public List<Integer> locations = new LinkedList();
	
	public Token() {
		// Empty like my heart.
	}
	
	/**
	 * Constructor; applies values to the class attributes. 
	 * @param s1 rule
	 * @param s2 token
	 * @param i priority
	 */
	public Token( String s1, String s2, int i, boolean isRegex ) {
		literal = s1;
		token = s2;
		priority = i;
		isRegex = isRegex;
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
	public static Token makeToken( String s1, String s2, int i, boolean isRegex ) {
		Token t = new Token( s1, s2, i, isRegex );
		return t;
	}
	
	/**
	 * Returns the rule from a Token.
	 * @param t
	 * @return
	 */
	public static String getLiteral( Token t ) {
		return t.literal.toString();
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
			System.out.print( Token.getLiteral( t ) + " " );
			System.out.print( Token.getToken( t ) + " " );
			System.out.print( Token.getPriority( t ) + "\n" );
		}
	}

}
