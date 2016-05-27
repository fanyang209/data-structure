public List<String> permutations( String set ) {
		List<String> res = new ArrayList<String>() ;
		if( set == null ) {
			return res ;
		}
		char[ ] array = set.toCharArray() ;
		helper( array, 0, res ) ;
		return res ;
	}

	public void helper( char[ ] array, int index, List<String> res ) {
		// base case 
		if( index == array.length ) {
			res.add( new String( array )) ;
			return ;	
		}
		//recursive rule
		for( int i = index; i < array.length; i++ ) {
			swap( array, index, i ) ;
			helper( array, index + 1, res ) ;
			swap( array, index, i ) ;
		}
	}

	public void swap( char[ ] array, int left, int right ) {
		char temp = array[ left ] ;
		array[ left ] = array[ right ] ;
		array[ right ] = temp ;
	}
