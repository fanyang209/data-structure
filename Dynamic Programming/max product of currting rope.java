public int maxProduct( int n ) {
	if( n <= 2 ) {
	return 1 ;
}
// base case
int[ ] dp = new int[ n + 1 ] ;
dp[ 0 ] = 0 ;
dp [ 1 ] = 0 ;
// induction rule
for( int i = 1 ; i < dp.length; i++ ) {
	int curMax = 0 ;
	for( int j = 1; j <= i / 2; j++ ) {
	curMax = Math.max(curMax, Math.max( j, dp[ j ]) * Math.max((i – j), dp[ i – j ] )); 
}
dp[ i ] = curMax ;
}
return dp[ n ] ;
}