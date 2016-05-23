// oriStack is used for storing new data
// addiStack is used for popping data out
Stack oriStack = new Stack() ;
Stack addiStack = new Stack() ;

public void offer( int val ) {
	while ( !addiStack.isEmpty() ) {
	    oriStack.push ( addiStack.pop() ) ;
     }
oriStack.push ( val ) ;
}

public int poll() {
	if (  !addiStack.isEmpty() ) {
	addiStack.pop() ;
} else {
	while ( ! oriStack.isEmpty() ) {
	addiStack.push ( oriStack.pop() ) ;
       	}
addiStack.pop() ;
}
}