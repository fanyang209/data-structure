public List<String> validParentheses( int k ) {
		List<String> res = new ArrayList<String>() ;
		if( k == 0 ) {
			return res ;
		}
		char[ ] cur = new char[ 2 * k ] ;
		helper( cur, 0, 0, 0, res ) ;
		return res ;
	}

	public void helper( char[ ] cur, int left, int right, int index, List<String> res ) {
		//base case 
		if( left == k && right == k ) {
			res.add( new String( cur )) ;
			return ;
		}
		// recursive rule
		if( left < n ) {
			cur[ index ] = '(' ;
			helper( cur, left + 1, right, index + 1, res ) ;
		}
		if( right < left ) {
			cur[ index ] = ')' ;
			helper( cur, left, right + 1, indext + 1, res ) ;
		}
	}
