package src;

public class CompileObj {
	
	public static String filename;
	public static String[][][] rules = 
			//   Rule                            Token                Priority
		{	{	{  }   }
"/\\*([^*]|[\\r\\n]|(\\*+([^*/]|[\\r\\n])))*\\*+/", "COMMENT", null},
			{	{"d+",                          "NUMBER",           "60"},
			{	{"int",                         "TYPE_INT",         "60"},
			{	{"char",                        "TYPE_CHAR",         "5"},
			{	{"main",                        "MAIN",             null},
			{	{"return",                      "RETURN",            "5"},
			{	{"else",                        "ELSE",             "10"},	
			{	{"if",                          "IF",               "10"},
			{	{"for",                         "FOR",              "10"},
			{	{"[_a-zA-Z][_a-zA-Z0-9]{0,31}", "IDENTIFIER",        "8"},
			{	{"{",                           "LB",                "9"},
			{	{"}",                           "RB",               "10"},
			{	{";",                           "SEMICOLON",        "70"},
			{	{"<=",                          "LESSTHANEQUAL",    "20"},
			{	{"<",                           "LESSTHAN",         "20"},
			{	{">=",                          "GREATERTHANEQUAL", "20"},
			{	{">",                           "GREATERTHAN",      "20"},
			{	{"+",                           "PLUS",             "70"},
			{	{"-",                           "MINUS",            "70"},
			{	{"*",                           "MULTIPLY",         "65"},
			{	{"/",                           "DIVIDE",           "65"},
			{	{"(",                           "LP",               "40"},
			{	{")",                           "RP",               "40"},
			{	{"==",                          "EQUALVALUE",       "20"},
			{	{"=",                           "EQUALSIGN",        "30"}  

			}
			}}}}}}}}}}}}}}}}}}}}}}}
	
}
