public List<Integer> spiral( int[ ][ ] matrix ) {
	List<Integer> list = new ArrayList<Integer>() ;
	spiral(matrix, 0, matrix.size, list ) ;
	return list ;
}
public void spiral( int[ ][ ] matrix, int offset, int size, List<Integer> list ) {
	// base case
	if( size < 1 ) {
	return ;
}
for( int i = 0; i < size - 1; i++ ) {
	list.add( matrix[ offset ][ offset + i ] ) ;
}
for( int i = 0; i < size - 1; i++ ) {
	list.add( matrix[ offset + i ][ size - 1 - offset ] ) ;
}
for( int i = size - 1; i > 0; i-- ) {
	list.add( matrix[ size - 1 - offset ][ i - offset ] ) ;
}
for( int i = size - 1; i > 0; i-- ) {
	list.add( matrix[ i ][ offset ] ) ;
}
// recursive rule
spiral( matrix, offset + 1; size - 2; list ) ;
}