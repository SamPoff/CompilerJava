package src;

public class Start {
	
	private static String path = "/Users/sp31485/git/CompileAnew/Compiler_WorkYouFrig/src/test.c";
	
	public static void main( String[] args ) {
		
		GenTokenRules rules = new GenTokenRules();
		int rulesAmount = rules.length;
		GenTokens tokens[] = new GenTokens[]( rules );
		
	}

}
