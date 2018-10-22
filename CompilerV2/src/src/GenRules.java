package src;

/**
 * <p>Author smp</p>
 * 
 * This class defines all of the lexing rules and has some helper functions to 
 * figure out how many rules currently exist. 
 */

public class GenRules {

	public static String[] rules = {
			"/\\*([^*]|[\\r\\n]|(\\*+([^*/]|[\\r\\n])))*\\*+/",
			"d+",
			"int",
			"char",
			"main",
			"return",
			"else", 
			"if",
			"for",
			"[_a-zA-Z][_a-zA-Z0-9]{0,31}",
			"{",
			"}",
			";",
			"<=",
			"<",
			">=",
			">",
			"+",
			"-",
			"*",
			"/",
			"(",
			")",
			"==",
			"="
			};	
	
	public static String[] tokens = {
			"COMMENT", 
			"NUMBER",
			"TYPE_INT",
			"TYPE_CHAR",
			"MAIN",
			"RETURN",
			"ELSE",
			"IF",
			"FOR",
			"IDENTIFIER",
			"LB",
			"RB",
			"SEMICOLON",
			"LESSTHANEQUAL",
			"LESSTHAN",
		    "GREATERTHANEQUAL",
		    "GREATERTHAN",
			"PLUS",
			"MINUS",
			"MULTIPLY",
			"DIVIDE",
			"LP",
			"RP",
			"EQUALVALUE",
			"EQUALSIGN"
	        };
	
	public static int[] priorities = {
			-1,
			60,
			60,
			5,
			-1,
			5,
			10,	
			10,
			10,
			8,
			9,
			10,
			70,
			20,
			20,
			20,
			20,
			70,
			70,
			65,
			65,
			40,
			40,
			20,
			30 
			};
	
	/**
	 * Prints how may tokens are currently defined. 
	 */
	public static int length = priorities.length;
	
	/**
	 * Returns all of the rules components in array form.
	 */
	public static String[] returnRules() {
		return rules;
		
	}
	
	/**
	 * Returns all of the token components in array form.
	 */
	public static String[] returnTokens() {
		return tokens;
		
	}
	
	/**
	 * Returns all of the priorities in array form.
	 */
	public static int[] returnPriorities() {
		return priorities;
		
	}
	
	/**
	 * Prints the rule followed by token, followed by priority. Isn't formatted very well. 
	 */
	public static String printRules(  ) {
		String out = "";
		for( int i = 0; i < priorities.length; i++ ) {
			out += rules[i] + " " + tokens[i] + " " + String.valueOf( priorities[i] ) + "\n";
		}
		return out;
	}
	
}
