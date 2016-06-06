public int largest( int[ ][ ] matrix ) {
	if( matrix.length == 0 || matrix[ 0 ].length == 0 ) {
		return 0 ;
}
int[ ][ ] dp = new int[ matrix.length ][ matrix[ 0 ].length ] ;
// base case
for( int i = 0; i < dp.length; i++ ) {
	dp[ i ][ 0 ] = 1 ;
}
for( int j = 0; j < dp[ 0 ].length; j++ ) {
	dp[ 0 ][ j ] = 0 ;
}
// induction rule
int global_max = 0 ;
for( int i = 1; i < dp.length; i++ ) {
	for( int j = 1; j < dp[ 0 ].length; j++ ) {
	if( matrix[ i ][ j ] == 0 ) {
	dp[ i ][ j ] = 0 ;
} else {
	dp[ i ][ j ] = 1 + Math.min( dp[ i - 1 ][ j - 1 ], Math.min( dp[ i ][ j - 1 ], dp[ i - 1 ][ j ] ) ) ;
}
global_max = Math.max( global_max, dp[ i ][ j ] ) ;
}
}
return global_max ;
}