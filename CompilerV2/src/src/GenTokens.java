package src;

import org.json.simple.JSONObject;

public class GenTokens {
	
	String s1;
	String s2;
	int     i;
	
	public GenTokens Token ( String s1, String s2, int i ) {
		return( {s1, s2, i} );
	}
	
}
