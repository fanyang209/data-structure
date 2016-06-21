public int[ ] pushZero( int[ ] arr ) {
	if( arr.length <=  1 ) {
	return arr.length ;
}
int slow = 0 ;
int fast = 0 ;
while( fast < arr.length ) {
	if( arr[ fast ] == 0 ) {
	fast++ ;
} else {
	arr[ slow++ ] = arr[ fast++ ] ;
}
}
while( slow < arr.length ) {
	arr[ slow++ ] = 0 ;
}
return arr ;
}