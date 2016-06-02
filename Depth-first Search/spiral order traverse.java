public int[ ][ ] spiral( int n ) {
	int [ ] [ ] a = new int[ n ] [ n ] ;
	spiral( a, 0, n, 0 ) ;
	return a ;
}

public void spiral( int[ ] [ ] a, int offset, int size ; int counter ) {
	// base case
	if( size <= 1 ) {
	return ;
}

int left = 0, up = 0, right = size - 1, down = size - 1 ;
for( int i = 0; i < size - 1; i++ ) {
	a[ offset ] [ offset + i ] = counter++ ;
}
for(  int i = 0; i <= size - 1; i++ ) {
	a[ i + offset ] [ size - 1 - offset ] = counter++ ;
}
for(  int i = size - 1; i >= 0; i-- ) {
	a[ size - 1 - offset ] [ i - 1 ] = counter++ ;
}
for(  int i = size - 1; i >= 0; i-- ) {
	a[ i - 1] [ offset ] = counter++ ;
}
// recursive rule 
spiral( a, offset + 1, size - 2, counter ) ;

}