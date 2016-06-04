public boolean jump(int[ ] a ) {
	return jumpHelper( a, 0 ) ;
}

public boolean jumpHelper( int[ ] a, int index ) {
	// base case 
	if( index >= a.length - 1 ) {
		return ture ;	
	}
	// recursive rule
	int jump = a[ index ] ;
	for( int i = 1; i<= jump; i++ ) {
		if( jumpHelper(a, index + i ) ) {
			return true ;
		}	
	}
	return false ;
}

// dp
// dp[ i ] represents whether we can reach the target from a[ i ]
public boolean jump(int[ ] a ) {
	int len = a.length ;
	boolean[ ] dp = new boolean[ len ] ;
	// base case
	dp[ len - 1 ] = true ;
	// induction rule
	for( int i = len - 2; i >= 0; i-- ) {
		for( int k = 1; k <= a[ i ]; k++ ) {
			if( k + i >= len - 1 || ( k + i < len - 1 && dp[ k + i ] == true ) ) {
				dp[ i ] = true ;
				break ;
			}
		}
	}
	return dp[ 0 ] ;
}