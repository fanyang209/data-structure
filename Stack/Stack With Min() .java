Stack oriStack = new Stack() ;
Stack minStack = new Stack() ;

public int Min() {
	 return minStack.pop() ;
}

public void push( int val ) {
	if ( oriStack.isEmpty()  ||  minStack.peek() >= val ) {
	minStack.push( val ) ;
} 
oriStack.push( val );
}

public int pop() {
	if ( oriStack.isEmpty() ) {
	return null ;
}
	if( minStack.peek() == oriStack.peek() ) {
	minStack.pop();
}
return oriStack.pop();
} 