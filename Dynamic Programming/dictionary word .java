public boolean dicionary( Set<String> dic, String input ) {
          	boolean[ ] dp = new boolean[ input.length() + 1 ] ;
          	// base case
          	dp[ 0 ] = true ;
          	for( int i = 1; i < dp.length; i++ ) {
                         	for( int j = 0; j < i; j++ ) {
                                       	if( dic.contains( input.substring( j, i ) ) && dp[ j ] ) {
          	dp[ i ] = true ;
          	break ;
}
}
}
return dp[ dp.length – 1 ] ;
}