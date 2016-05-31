public boolean allUnique( String word ) {
	int[ ] vec = new int[ 8 ] ;
	char [ ] arr = word.toCharArray() ;
	for( int i = 0; i < arr.length; i++ ) {
		// find which int value
	int index_1 = arr[ i ] / 32 ;
	// find which bit
	int index_2 = arr[ i ] % 32 ;
	// check if index_2 position is 1 or not
	if( ( vec[ index_1 ] >> index_2 ) & 1 == 1 ) {
	return false ;
} else {
	// set index_2 position to 1
	vec[ index_1 ] |= ( 1 << index_2 ) ;
}
}
return true ; 
}