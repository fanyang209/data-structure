public String reverse ( String input ) {
	if( input.length <= 1 ){
	return input ;
}
char[ ] arr = input.toCharArray() ;
helper( arr, 0, arr.length - 1 ) ;
return new String( arr ) ;
}

public void helper( char[ ] arr, int left, int right ) {
	// base case
	if( left >= right ) {
	return ;
}
// recursive rule
char temp = arr[ left ] ;
arr[ left ] = arr[ right ] ;
arr[ right ] = temp ;
	helper( arr, left + 1, right - 1 ) ;
}