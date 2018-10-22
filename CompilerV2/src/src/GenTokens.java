package src;

import org.json.simple.JSONObject;

public class GenTokens ( String[] s1, String[] s2, int[] i ) {

	JSONObject[] jTokens = new GenTokens()
	
	for( int j = 0; j < s1.length; j++ )
		GenTokens( s1[j], s2[j], i[j] );
	
	public JSONObject GenTokens ( s1, s2, i ) {
		String message;
		JSONObject json = new JSONObject();
		json.put( "rule",      s1 );
		json.put( "token",     s2 );
		json.put( "priority",  i );
		return( json );
	}
	
}
//TODO Figure out this json shit, get some stuff working. 