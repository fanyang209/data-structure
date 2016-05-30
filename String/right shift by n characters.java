public String rightShift( String input, int n ) {
	if ( input.length() <= 1 || input == null ) {
	return input ;
}
char[ ] arr = input.toCharArray() ;
reverse( arr, 0, arr.length - 1 ) ;
reverse( arr, 0, n - 1 ) ;
reverse( arr, n, arr.length - 1 ) ;

}

public void reverse( char[ ] arr, int left, int right ) {
	while( left < right ) {
		char temp = arr[ left ] ;
		arr[ left ] = arr[ right ] ;
		arr[ right ] = temp ;
		left++;
		right-- ;
}
}