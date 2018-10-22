package src;

public class Start {
	
	private static String path = "/Users/sp31485/git/CompileAnew/Compiler_WorkYouFrig/src/test.c";
	
	public static void main( String[] args ) {
		
		// Generates three arrays of rules, tokens, and priorities. 
		GenRules RulesGenerated = new GenRules();
		System.out.println( RulesGenerated.printRules() );
		
		
		// Generates an array of token objects containing all three attributes.
		String[] rules = RulesGenerated.returnRules();
		String[] tokens = RulesGenerated.returnTokens();
		int[] priorities = RulesGenerated.returnPriorities();
		GenTokens tokens[];
		for( int i = 0; i < rules.length; i++ ) {
			tokens[i] = new GenTokens( rules );
		}
		
	}

}
