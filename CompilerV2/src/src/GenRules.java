package src;

/**
 * @author sp31485
 * <p>
 * This class defines all of the lexing rules and tokens and has some helper functions to 
 * figure out how many rules currently exist. The arrays and values can be accessed statically, ie, no 
 * need to initialize a GenRules object. If the priority of a lexeme is 'None' it will return a '-1'. 
 * </p>
 */

public class GenRules {

	/**
	 * Regex comparison to a given token.
	 */
	public static String[] rules = { // 25 rules
			"/\\*([^*]|[\\r\\n]|(\\*+([^*/]|[\\r\\n])))*\\*+/"        ,
			"d+"  ,"int","char","main"                       ,"return",
			"else","if" ,"for" ,"[_a-zA-Z][_a-zA-Z0-9]{0,31}","{"     ,
			"}"   ,";"  ,"<="  ,"<"                          ,">="    ,
			">"   ,"+"  ,"-"   ,"*"                          ,"/"     ,
			"("   ,")"  ,"=="  ,"="
			};	
	
	/**
	 * Token issued to token at corresponding index.
	 */
	public static String[] tokens = { // 25 tokens
			"COMMENT"         ,"NUMBER"     ,"TYPE_INT" ,"TYPE_CHAR"    ,"MAIN",
			"RETURN"          ,"ELSE"       ,"IF"       ,"FOR"          ,"IDENTIFIER",
			"LB"              ,"RB"         ,"SEMICOLON","LESSTHANEQUAL","LESSTHAN",
		    "GREATERTHANEQUAL","GREATERTHAN","PLUS"     ,"MINUS"        ,"MULTIPLY",
			"DIVIDE"          ,"LP"         ,"RP"       ,"EQUALVALUE"   ,"EQUALSIGN"
	        };
	
	/**
	 * Priority issued to a corresponding token. 
	 */
	public static int[] priorities = { // 25 priorities
			-1,60,60, 5,-1,
			5 ,10,10,10, 8,
			9 ,10,70,20,20,
			20,20,70,70,65,
			65,40,40,20,30 
			};
	
	/**
	 * Prints how may tokens are currently defined. If there is a mismatch in how
	 * many tokens there are in comparison to priorities or rules it will return '0'.
	 */
	public static int length() {
		if( priorities.length == tokens.length && tokens.length == rules.length )
			return rules.length;
		else return 0;
	}
	
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
