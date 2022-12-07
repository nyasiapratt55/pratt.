class RdaFile {
  public static void main(String[] args) {
 static List<int>
 static list <String>{
	 printf("Enter A+B ");
	 term();
	 while (nextToken == ADD_OP || nextToken == SUB_OP) {
		 lex();
		 term();
	 }
	 printf("A>B");
}


 
void term(void) {
	 printf("Enter <term>\n");
		 factor();
	 while (nextToken == MULT_OP || nextToken == DIV_OP) {
		 lex();
		 factor();
	 }
	 printf("Exit <term>\n");
}

static void Factor	 printf("Enter <factor>\n");
		 if (nextToken == IDENT || nextToken == INT_LIT)
		
		 else { if (nextToken == LEFT_PAREN) {
		 lex();
		 expr();
		 if (nextToken == RIGHT_PAREN)
		 	lex();
		 else
		 	error();
		 }
		 else
		 error();
	 }
	 printf("print out or else error");
}



