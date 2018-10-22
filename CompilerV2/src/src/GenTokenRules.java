package src;

public class GenTokenRules {

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
	
	public static int length = priorities.length;
	
	public static void printRules(  ) {
		for( int i = 0; i < 25; i++ ) {
			System.out.println( rules[i] + " " + tokens[i] + " " + String.valueOf( priorities[i] ) );
		}
	}
	
}
