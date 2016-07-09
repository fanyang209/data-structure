public List<String> validIf( int n ) {
          	List<String> res = new ArrayList<String>() ;
          	StringBuilder sb = new StringBuilder() ;
          	if( n <= 0 ) {
          	return res ;
}
helper( res, sb, n, 0, 0 ) ;
return res ;
}
public void helper(List<String> res, StringBuilder sb, int n, int left, int right  ) {
          	// base case
          	if( left == n && right == n ) {
          	res.add( sb.toString() ) ;
          	return ;
}
// recursive rule
if( left < n ) {
          	sb.append( ‘(‘ ) ;
          	helper( res, sb, n, left + 1, right ) ;
          	sb.deleteCharAt( sb.length() – 1 ) ;
}
if( right < left ) {
          	sb.append( ‘)’ ) ;
          	helper( res, sb, n, left, right + 1 ) ;
          	sb.deleteCharAt( sb.length() - 1 )
}
}