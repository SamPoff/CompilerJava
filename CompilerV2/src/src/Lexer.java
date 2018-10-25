
package src;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;

/**
 * @author sp31485
 *Entrence point for lexer. Should return a token, it's value (rule), location, and priority. 
 */
public class Lexer {
	
	public Token tokenCurrent[];
	public String[] rule;
	public String[] token;
	public int[] priority;
	public int start = 0;
	public int stop = 0;
	public String lexSubject;

	public Lexer() {
		// Lonely
	}
	
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
