
package src;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author sp31485
 *Entrance point for lexer. Should return a token, it's value (rule), location, and priority. 
 */
public class Lexer {
	
	public Token tokenCurrent[];
	public String[] rule;
	public String[] token;
	public int[] priority;
	public int start = 0;
	public int stop = 0;
	public String lexSubject;

	/**
	 * Default constructor, probably won't be used.
	 */
	public Lexer() {
		// Lonely
	}
	
	/**
	 * Actual constructor, takes in rule tokens and runs them through the lexer.
	 * The result should be enhanced LexemeTokens with location data and literal
	 * values for regex's.
	 * @param tok
	 * @param path
	 * @throws Exception
	 */
	public Lexer( Token[] tok, String path ) throws Exception {
		tokenCurrent = tok;
		lexSubject = inputLexData_RemoveWhiteSpace( path );
		lexData( lexSubject, tok );
		for( Token t: tok ) {
			System.out.print( "Literal " + Token.getLiteral(t) + " at index " );
			Object[] locs = new Object[ t.locations.size() ];
			t.locations.toArray( locs );
			for( int i = 0; i < t.locations.size(); i++ ) System.out.print( " " + locs[i] );
			System.out.println("\n");
		}
	}

	/**
	 * Removes white space and returns string. 
	 * @param path
	 * @return
	 * @throws IOException
	 */
	public String inputLexData_RemoveWhiteSpace( String path ) throws IOException { 
		String data = ""; 
		data = new String( Files.readAllBytes( Paths.get( path ) ) );
		data = data.replaceAll( "\\s", "" );
		System.out.println( data + "\n" );
		System.out.println( "data length = " + data.length() + "\n" );
		return data;
	} 	
	
//	public static void lexData( String data, Token[] tok ) {
//		for( Token t: tok ) {
//			int length = t.literal.length();
//			for( int i = 0; i < data.length(); i++ ) {
//				int index = data.indexOf( Token.getLiteral(t) );
//				t.locations.add( index );
//				while( index >= 0 ) {
//				    index = data.indexOf( Token.getLiteral(t), index + 1 );
//				    t.locations.add( index );
//				}
//			}
//		}
//	}
	
	//TODO: Should output something like:
	// Literal "int", at: 2, 4, 5, etc...
	// Need to fix regex to get back initial value that the regex is recognizing. 
	
	/**
	 * Should return an array of LexemeTokens.
	 * @param data
	 * @param tok
	 */
	public static void lexData( String data, Token[] tok ) {
			for( int i = 0; i < data.length(); i++ ) {
				for( Token t: tok ) {
					int length = t.literal.length();
					int index = data.indexOf( Token.getLiteral(t) );
					t.locations.add( index );
					while( index >= 0 ) {
					    index = data.indexOf( Token.getLiteral(t), index + 1 );
					    t.locations.add( index );
				}
			}
		}
	}
			
	
	
}
