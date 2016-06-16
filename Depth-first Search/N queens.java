public List<List<Integer>> nQueens( int n ) {
	 List<List<Integer>> res = new  ArrayList<List<Integer>>() ;
	if( n <= 0 ) {
	return res ;
}
	 List<Integer> cur = new ArrayList<Integer>() ;
	helper( 0, n, cur, res ) ;
	return res ;
}

public void helper( int index, int n,  List<Integer> cur, List<List<Integer>> res ) {
	// base case
	if( index == n ) {
	res.add( new ArrayList<Integer>( cur ) ) ;
	return ;
}
	// recursive rule
	for( int i = 0; i < n; i++ ) {
	cur.add( i ) ;
	if( valid( cur ) ) {
	helper( index + 1, cur, res ) ;
}
cur.remove( cur.size() - 1 ) ;
}
}

public boolean valid( List<Integer> cur ) {
	int size = cur.size() ;
	for( int i = 0; i < size - 1; i++ ) {
	if( cur.get( i ) == cur.get( size - 1 ) || 
    cur.get( i ) - cur.get( size - 1 ) == i + 1 - size  ||
cur.get( i ) - cur.get( size - 1 ) == size - 1 - i ) {
	return false ;
}
}
return true ;
}