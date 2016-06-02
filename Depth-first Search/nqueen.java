public List<List<Integer>> nQueen( int n ) {
	List<List<Integer>> res = new ArrayList<List<Integer>>() ;
	List<Integer> cur = new ArrayList<Integer>() ;
	helper( 0, n, cur, res ) ;
	return res ;
}
public void helper( int index, int n, List<Integer> cur, List<List<Integer>> res ) {
	// base case
	if ( index == n ) {
	res.add( new ArrayList<List<Integer>>( cur ) ) ;
	return ;
}
// recursive rule 
for( int i = 0; i < n; i++ ) {
	cur.add( i ) ;
	if( valid( cur ) ) {
	helper( index + 1, n, cur, res ) ;
}
cur.remove( cur.size() - 1 ) ;
}
}