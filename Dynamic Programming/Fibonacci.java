public int fibN( int n ) { 
	// base case
	int[ ] dp = new int[ n ] ;
	dp[ 0 ] = 0 ;
	dp[ 1 ] = 1 ;
	// induction rule
	for( int i = 2; i < n; i++ ) {
	dp[ i ] = dp[ i – 1 ] + dp[ i – 2 ] ;
}
return dp[ n ] ;
}