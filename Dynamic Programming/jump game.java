public boolean jump(int[ ] a ) {
	int len = a.length ;
	boolean[ ] dp = new boolean[ len ] ;
	// base case
	dp[ len - 1 ] = true ;
	// induction rule
	for( int i = len - 2; i >= 0; i-- ) {
		for( int k = 1; k <= a[ i ]; k++ ) {
			if( k + i >= len - 1 || ( k + i < len - 1 && dp[ k + i ] == true ) ) {
				dp[ i ] = true ;
				break ;
			}
		}
	}
	return dp[ 0 ] ;
}