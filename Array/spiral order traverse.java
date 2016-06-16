public List<Integer> spiralTraverse( int[ ][ ] matrix ) {
	List<Integer> res = new ArrayList<Integer>() ;
	if( matrix.length = 0  || matrix[ 0 ].length == 0 ) {
	return res ;
}
helper(0, matrix.length, res, matrix ) ;
return res ;
}

public void helper( int index, int size, List<Integer> res, int[ ][ ] matrix ) {
	// base case
	if( size < 1 ) {
	return ;
}
// up
for( int i = 0; i < size - 1; i++ ) {
	res.add( matrix[ index ][  i + index ] ) ;
}
// right
for( int i = 0; i < size - 1; i++ ) {
	res.add( matrix[ i + index ][   size - 1 + index ] ) ;
}
// down
for( int i = size - 1; i > 0; i-- ) {
	res.add( matrix[ size - 1 + index ][   i + index ] ) ;
}
// left
for( int i = size - 1; i > 0; i-- ) {
	res.add( matrix[  i + index ][  index ] ) ;
}

// recursive rule
helper( index + 1, size - 2, res, matrix ) ;
}