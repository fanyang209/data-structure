public boolean wordSolver( String word, HashSet<String> dic ) {
	boolean[ ] dp = new boolean[ word.length() + 1 ] ;
	dp[ 0 ] = false ;   // base case
	// induction rule
	for( int i = 1; i<= word.length(); i++ ) {
		// if word is in the dictionary, done
		if( dic.contains( word.subString( 0, i ) ) ) {
		dp[ i ] = true ;
		break ;
}
// otherwise, check the possible single spits
for( int j = 1; j < i; j++ ) {
	// check subproblem and check the rest of the word
	if( dp[ j ]  &&  dic.contains( word.subString( j, i ) ) ) {
	dp[ i ] = true ;
	break ;
}
}
}
return dp[ word.length() ] ;
}