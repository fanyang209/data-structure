public int longestOnes( int[ ] arr ) {
	if( arr == null || arr.length == 0 ) {
		return 0 ;
}
int[ ] dp = new int[ arr.length ] ;
// base case
if( arr[ 0 ] == 0 ) {
dp[ 0 ] = 0 ;	
} else {
	dp[ 0 ] = 1 ;
}
// induction rule
int global_max = 0 ;
for( int i = 1; i < arr.length; i++ ) {
	if( arr[ i ] == 0 ) {
		dp[ i ] = 0 ;
} else {
	dp[ i ] = dp[ i - 1 ] + 1 ;
}
global_max = Math.max( dp[ i ], global_max ) ;
}
return global_max ;
}