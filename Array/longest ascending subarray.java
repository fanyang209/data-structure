public int longest( int[ ] arr ) {
	if( arr.length == 0 ) {
		return 0 ;
	}
	int[ ] dp = new int[ arr.length ] ;
	int res = Integer.MIN_VALUE ;
	// base case
	dp[ 0 ] = 1 ;
	// induction rule
	for( int i = 1; i < arr.length; i++ ) {
		if( arr[ i ] > arr[ i - 1 ] ) {
			dp[ i ] = dp[ i - 1 ] + 1 ;
			res = Math.max( res, dp[ i ] ) ;	
		} else {
			dp[ i ] = 1 ;
		}
		
	}
	return res ;
}