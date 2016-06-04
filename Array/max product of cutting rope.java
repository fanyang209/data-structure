public int maxProduct( int length ) {
	if ( length <= 1 ) {
		return length ;
	}
	int[ ] dp = new int[ length + 1 ] ;
	// base case
	dp[ 1 ] = 0 ;
	dp[ 0 ] = 0 ;
	// induction rule
	for( int i = 1; i <= length ; i++ ) {
		int curMax = 0 ;
		for( int j = 1; i <= i / 2 ; j++ ){
			curMax = Math.max( curMax, Math.max( j, dp[ j ] ) * Math.max( i - j, dp[ i - j ]) ) ;
		}	
		dp[ i ] = curMax ;
	}
	return dp[ length ] ;	
}