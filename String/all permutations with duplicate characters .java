public List<String> permutations( String input ) {
	List<String> res = new ArrayList<String>() ;
	if( input == null ) {
		return res ;
}
char[ ] arr = input.toCharArray() ;
helper( arr, 0, res ) ;
return res ;
}

public void helper( char[ ] arr, int index, List<String> res ) {
	// base case
	if( index == arr.length ) {
		res.add( new String( arr )) ;
 	return;
}
// recursive rule
Set<Character> used = new HashSet<Character>() ;
for( int i = index; i < arr.length; i++ ) {


	if( !used.contains( arr[ i ] )) {
		used.add( arr[ i ] ) ;
		swap( arr, i, index ) ;
		helper( arr, index + 1, res ) ;
		swap( arr, i, index ) ;
	}
}
}