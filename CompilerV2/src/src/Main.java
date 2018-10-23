package src;

public class Main {
	
	private static String path = "/Users/sp31485/git/CompileAnew/Compiler_WorkYouFrig/src/test.c";
	
	public static void main( String[] args ) {
		
		// GenRules contains three arrays, one with the lexemes, another with their
		// corresponding tokens, and another with their priorities. They are separate
		// arrays but are related by index.
		int length = GenRules.length();
		
		// Generates an array of token objects containing all three attributes. 
		Token[] tok = new Token[ length ]; 
		for( int i = 0; i < length; i++ ) 
			tok[i] = Token.makeToken( GenRules.rules[i], GenRules.tokens[i],GenRules.priorities[i] );
		
//		Lexer lex = new Lexer( tok, path ); 
		
		
		
	}

}

