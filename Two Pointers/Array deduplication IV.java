public int dedup( int[ ] arr ) {
	if( arr.length <= 1 ) {
		return arr.length ;
}
Stack<Integer> stack = new Stack<Integer>() ;
int i = 0 ;
while( i < arr.length ) {
	int start = arr[ i ] ;
	if( !stack.isEmpty() && start == stack.peek() ) {
	while( i < arr.length && start == arr[ i ] ) {
	i++ ;
}
stack.pop() ;
} else {
	stack.push( start ) ;
	i++ ;
}
}
return stack.size() ;
}