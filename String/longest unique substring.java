public int uniqueSubstring( String input ) {
	if( input == null || input.length() <= 1 ) {
		return input ;
}
char [ ] arr = input.toCharArray() ;
	int longest = 0 ;
	int slow = 0 ;
	int fast = 0  ;
	HashSet<Character> unique = new HashSet<Character>() ;
	while( fast < arr .length ) {
	if( !unique.contains( arr [ fast ] )) {
		unique.add( arr[ fast ] ) ;
		longest = Math.max( longest, fast - slow + 1 ) ;
		fast++ ;
} else {
	unique.remove( input[ slow ] ) ;
	slow++ ;
}
}
return longest ; 
}