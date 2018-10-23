
package src;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author sp31485
 *Entrence point for lexer. Should return a token, it's value (rule), location, and priority. 
 */
public class Lexer {
	
	public Token token;
	public String[] rule;
	public int location;
	public int[] priority;

	public Lexer() {
		// Lonely
	}
	
//	public Lexer( Token tok, String path ) {
//		int index = 1;
//		List<String> regexParts = new ArrayList<String> ();
//		Map<String, String> groupType = new HashMap<String, String>();
//		Map<String, String> priorityDict = new HashMap<String, String>();
//		
//		for( String rules : tok.rules ) {
//			for( String tokens : tok.tokens ) {
//				for( int priority : tok.priorities ) {
//					String groupname = "GROUP%s" % index;
//					regexParts.
//				}
//			}
//		}
	
	public Lexer( Token tok, String path ) {
		token = tok;
		rule = tok.returnRules();
		location = 0;
		priority = tok.returnPriorities();
		
	}
	
	public void inputLexData( String path ) throws FileNotFoundException {
		File file = new File( path );
		FileInputStream fInStream = new FileInputStream( file );
	}
	
}
