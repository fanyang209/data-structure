public int editDis( String s1, String s2 ) {
	int[ ][ ] dp = new int[ s1.length() + 1 ][ s2.length() + 1 ] ;
	// base case
	for( int i = 0; i < dp.length; i++ ) {
	dp[ i ][ 0 ] = i ;
}
for( int j = 0; j < dp[0].length; j++ ) {
	dp[ 0 ][ j ] = j ;
}
// induction rule
for( int i  = 1; i < dp.length; i++ ) {
	for( int j = 1; j < dp[ 0 ].length; j++ ) {
	if( s1.charAt( i ).equals( s2.charAt( j ) ) ) {
		dp[ i ][ j ] = dp[ i - 1 ][ j - 1 ] ;
} else {
	dp[ i ][ j ] = 1 + Math.min( dp[ i - 1 ][ j - 1 ], Math.min( dp[ i - 1 ][ j ], dp[ i ][ j - 1 ] ) ) ;
}
}
}
	return dp[ s1.length() ][ s2.length() ] ;
}