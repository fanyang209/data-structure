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

//  simulate a stack 
public int dedup( int[ ] arr ) {
	int end= -1 ;
	for( int i = 0; i < arr.lengh; i++ ) {
		if( end == -1 || arr[ end ] != arr[ i ] ) {
		arr[ ++end ] = arr[ i ] ;
} else {
	while( i + 1 < arr.length && arr[ i + 1 ] == arr[ end ] ) {
	i++ ;
}
end-- ;
}
}
return end + 1 ;
}