public String shuffle( String input ) {
	if( input == null || input.length() <= 1 ) {
	return input ;
}
char[ ] arr = input.toCharArray() ;
shuffle( arr, 0, arr.length - 1 ) ;
return new String( arr ) ;
}

public void shuffle( char[ ] arr, int left, int right ) {
	// base case 
	if( left >= right ) {
	return ;
}
int size = right - left + 1;
int mid = left + size / 2 ;
int leftmid = left + size / 4 ;
int rightmid = left + size * 3 / 4 ;

// reverse chunk 2 
reverse( arr, leftmid, mid - 1 ) ;
// reverse chunk 3
reverse( arr, mid, rightmid - 1 ) ;
// reverse chunk 2 + chunk 3
reverse( arr, leftmid, rightmid - 1 ) ;

// recursive rule
shuffle( arr, left, left + 2 * ( leftmid - left ) - 1 ) ;
shuffle( arr, left + 2 * ( leftmid - left ), right ) ;
}

public void reverse( char[ ] arr, int left, int right ) {
	// base case 
	if( left >= right ) {
	return ;
}
// recursive rule 
swap( arr, left, right ) ;
reverse( arr, left++, right-- ) ;
}