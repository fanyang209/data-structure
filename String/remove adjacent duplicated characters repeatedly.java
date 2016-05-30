public String removeDuplicate( String s ) {
	if( s.length() <= 1 ) {
	return s ;
}
Stack<Character> stack = new Stack<Character>() ;
int i = 0 ;
while( i < s.length() ) {
	char start = s.charAt( i ) ;
	if( !stack.isEmpty() && start == stack.peek() ) {
	while( i < s.length() && start == s.charAt( i ) ) {
	i++ ;
}
stack.pop() ; 
} else {
	stack.push( start ) ;
	i++ ;
}
}
String final = new String() ;
for( int i = 0; i < stack.size(); i++ ) {
	final += stack.pop() ; 
}
}