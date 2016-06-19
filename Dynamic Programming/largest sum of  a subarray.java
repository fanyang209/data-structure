public int largestSum( int[ ] arr ) {
	// base case
	int[ ] dp = new int[ arr.length ] ;
dp[ 0 ] = arr[ 0 ] ;
// induction rule
int global_max = arr[ 0 ] ;
for( int i  = 1; i < arr.length; i++ ) {
	if( dp[ i - 1 ] >= 0 ) {
	dp[ i ] = dp[ i - 1 ] + arr[ i ] ;
}else {
	dp[ i ] = arr[ i ] ;
}
global_max = Math.max( global_max, dp[ i ] ) ;
} 
return global_max ;
}