package src;

import org.json.simple.JSONObject;

public class Token {

	String s1;
	String s2;
	int     i;
	
	public static void Token ( String s1, String s2, int i ){
		
		String message;
		JSONObject json = new JSONObject();
		json.put( "rule",  s1 );
		json.put( "token",  s2 );
		json.put( "priority",  i );
		
	}
	
	
}
