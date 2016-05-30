public String reverseSentence( String input ) {
	if( input.length() <= 1 ) {
	return input ;
}
char[ ] arr = input.toCharArray() ;
reverse( arr, 0, arr.length - 1 ) ;
int start = 0; 
int j = 0 ;
	while( j < arr.length ) {
		// the start index of a word
	if( arr[ j ] != ' '  && ( j == 0 || arr[ j - 1] == ' ' )) {
	start = j ;
}
// the end of a word
if( arr[ j ] != ' ' && ( j == arr.length - 1 || arr[ j + 1 ] == ' ' )) {
reverse( arr, start, j ) ;
}
}
return new String( arr ) ; 
}

public void reverse( char[ ] arr, int left, int right ) {
	// base case
	if( left >= right ) {
	return;
}
// recursive rule
swap( arr[ left ], arr[ right ] ) ;
reverse( arr, left + 1, right - 1 ) ;
}