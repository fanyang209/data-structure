public int largest( int[ ][ ] matrix ) {
	int n = matrix.length ;
	int m = matrix[ 0 ].length ;
	int res = Integer.MIN_VALUE ;
	for( int i = 0; i < n; i++ ) {
	int[ ] cur = new int[ m ] ;
	for( int j = i; j < n ; j++ ) {
		add( cur, matrix[ j ] ) ;
		res = Math.max( res, max( cur )  );
}
}
return res ;
 }

private void add( int[ ] cur, int[ ] add ) {
	for( int i = 0; i < cur.length ; i++ ) {
	cur[ i ] += add[ i ] ;
}
}

private int max( int[ ] cur ) {
	int res = cur[ 0 ] ;
	int temp = cur[ 0 ] ;
	for( int i = 1; i < cur.length; i++ ) {
		tmp = Math.max( tmp + cur[ i ], cur[ i ] ) ;
		res = Math.max( res, tmp ) ;
}
return res ;
}