package src;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author sp31485
 *Starting point for TB compiler. Alter 'path' variable to your input '.c' file.
 */

public class Main {
	
	private static String path = "/Users/sp31485/git/CompilerJava/CompilerV2/lib/test.c";
	
	public static void main( String[] args ) throws Exception {
		
		// GenRules contains three arrays, one with the lexemes, another with their
		// corresponding tokens, and another with their priorities. They are separate
		// arrays but are related by index.
		int length = GenRules.length();
		
		// Generates an array of token objects containing all three attributes. 
		Token[] tok = new Token[ length ]; 
		for( int i = 0; i < length; i++ ) {
			tok[i] = Token.makeToken( GenRules.rules[i],      GenRules.tokens[i],
								      GenRules.priorities[i], GenRules.isRegex[i] );
		}
		
		// Returns a lex of all of the previously created tokens. 
		// Still not sure if this will be an array of LexemeToken 
		// objects or not. 
		Lexer lex = new Lexer( tok, path );

		//TODO: Finish creating lexer tokens and begin work on building AST and tree walker. 
		
	}

}

