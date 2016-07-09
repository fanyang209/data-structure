public int minCuts( String input ) {
          	int[ ] dp = new int[ input.length() ] ;
          	char[ ] arr = input.toCharArray() ;
          	// base case
          	dp[ 0 ] = 0 ;
          	dp[ 1 ] = 1 ;
          	// induction rule
          	int global_min = Integer.MAX_VALUE;
          	for( int i = 0; i < arr.length; i++ ) {
if( isP(0, i ) ) {
          			dp[ i ] = 0 ;
          			countinue ;
}
 
          		for( int j = 0; j < i; j++ ) {
                         		if( isP( j + 1, i ) ) {
                                       	global_min = Math.max(global_min, dp[ j ] ) ;
}
}
dp[ i ] = global_min + 1 ;
}
return dp[ dp.length - 1 ] ;
}