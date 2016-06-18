public int longestAscendingSubarray( int[ ] arr ) {
	if( arr.length == 0 ) {
	return 0 ;
}
	// base case
	int[ ] dp = new int[ arr.length ] ;
	dp[ 0 ] = 1 ;
	// induction rule
	int res = dp[ 0 ] ;
	for( int i = 1; i < dp.length; i++ ) {
	if( arr[ i ] > arr[ i – 1 ] ) {
	dp[ i ] = dp[ i – 1 ] + 1 ;
	res = Math.max( dp[ i ], res ) ;
} else {
	dp[ i ] = 1 ;
}
}
return res ;
}