public int dedup( int[ ] arr ) {
	if( arr.length <= 2 ) {
	return arr.length ;
}
int slow = 2 ;
for( int i = 2; i < arr.length; i++ ) {
	if( arr[ i ] != arr[ slow - 2 ] ) {
	arr[ slow++ ] = arr[ i ] ;
}
}
return slow ;
}