
package src;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author sp31485
 *Entrence point for lexer. Should return a token, it's value (rule), location, and priority. 
 */
public class Lexer {
	
	public Token tokenCurrent;
	public String[] rule;
	public String[] token;
	public int[] priority;
	public int start;
	public int stop;
	public String lexSubject;

	public Lexer() {
		// Lonely
	}
	
	public Lexer( Token tok, String path ) throws Exception {
		tokenCurrent = tok;
		rule = tok.returnRules();
		token = tok.returnTokens();
		priority = tok.returnPriorities();
		start = 0;
		stop = 0;
		lexSubject = inputLexData_RemoveWhiteSpace( path );
	}

	public String inputLexData_RemoveWhiteSpace( String path ) throws IOException { 
		String data = ""; 
		data = new String( Files.readAllBytes( Paths.get( path ) ) );
		data = data.replaceAll( "\\s", "" );
		return data;
	} 
	
}
