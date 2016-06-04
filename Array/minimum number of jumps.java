public int minJumps( int[ ] arr ) {
	int len = arr.length ;
int[ ] dp = new int[ len ] ;
// base case
dp[ len - 1 ] = 0 ; 
// induction rule
curmin = Integer.MAX_VALUE ;
for( int i = len - 2 ; i >= 0; i-- ) {
	for( int j = 1; j <= arr[ i ]; j++ ) {
	curmin  = Math.min( dp[ i + j ], curmin ) ;
}
dp[ i ] = 1 + curmin ;
}
return dp[ 0 ] ;
}