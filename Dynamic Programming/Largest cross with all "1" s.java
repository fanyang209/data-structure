public int largestCrossOfOnes( int[ ][ ] matrix ) {
	int n = matrix.length;
	if( n == 0 ) {
return 0 ;
}
int m = matrix[ 0 ].length ;
if( m == 0 ) {
	return 0 ;
}
int[ ][ ]  leftup = leftup( matrix, n, m ) ;
int[ ][ ] rightdown = rightdown( matrix, n, m ) ;
return merge( leftup, rightdown, n, m ) ;
}

private int merge( int[ ][ ] leftup, int[ ][ ] rightdown, int n, int m ) {
	int res = 0 ;
	for( int i = 0; i < n; i++ ) {
		for( int j = 0; j < m; j++ ) {
			leftup[ i ][ j ] = Math.min( leftup[ i ][ j ], rightdown[ i ][ j ] ) ;
			res = Math.max( res, leftup[ i ][ j ] ) ;
}
}
return res ;
}

private int[ ][ ] leftup( int[ ][ ] matrix, int n, int m ) {
	int[ ][ ] left = new int[ n ][ m ] ;
	int[ ][ ] up = new int[ n ][ m ]	;
	for( int i = 0; i < n; i++ ) {
		for( int j = 0; j < m; j++ ) {
			if( matrix[ i ][ j ] == 1 ) {
				// dp[ ][ ] 
if( i == 0 && j == 0 ) {
			up[ i ][ j ] = 1 ;
			left[ i ][ j ] = 1 ;
} else if( i == 0 ) {
	up[ i ][ j ] = 1 ;
	left[ i ][ j ] = left[ i ][ j - 1 ] + 1 ;
} else if( j == 0 ) {
	up[ i ][ j ] = up[ i - 1 ][ j ] + 1 ;
	left[ i ][ j ] = 1 ;
} else {
	up[ i ][ j ] = up[ i - 1 ][ j ] + 1;
	left[ i ][ j ] = left[ i ][ j - 1 ] + 1;
}
}
}
}
merge( left, up , n , m );
return left ;
}

private int[ ][ ] rightdown( int[ ][ ] matrix, int n, int m ) {
	int[ ][ ] right= new int[ n ][ m ] ;
	int[ ][ ] down= new int[ n ][ m ]	;
	for( int i = n -1; i >= 0; i-- ) {
		for( int j = m - 1; j >=0; j-- ) {
			if( matrix[ i ][ j ] == 1 ) {
if( i == n -1 && j == m - 1 ) {
			down[ i ][ j ] = 1 ;
			right[ i ][ j ] = 1 ;
} else if( i == n -1 ) {
	down[ i ][ j ] = 1 ;
	right[ i ][ j ] = right[ i ][ j + 1 ] + 1 ;
} else if( j == m - 1 ) {
	down[ i ][ j ] = down[ i + 1 ][ j ] + 1 ;
	right[ i ][ j ] = 1 ;
} else {
	down[ i ][ j ] = down[ i + 1 ][ j ] + 1;
	right[ i ][ j ] = right[ i ][ j +1 ] + 1;
}
}
}
}
merge( right, down, n , m );
return right ;
}