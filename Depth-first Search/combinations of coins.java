public List<List<Integer>> combinations( int target, int[ ] coins ) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> cur = new ArrayList<Integer>() ;
		helper( target, coins, 0, cur, res ) ;
		return res;
	}

	public void helper( int target, int[ ] coins, int index, List<Integer> cur, List<List<Integer>> ) {
		//base case
		if( index == coins.length - 1 ) {
			if( target % coins[ coins.length - 1 ] == 0 ) {
				cur.add( target / coins[ coins.length - 1 ]) ;
				res.add( new ArrayList<Integer>( cur )) ;
				cur.remove( cur.size() - 1 ) ;
			}
			return;
		}
		// recursive rule
		int max = target / coins[ index ] ;
		for( int i = 0; i <= max; i++ ) {
			cur.add( i ) ;
			helper( target - i * coins[ index ], coins, index + 1, cur, res ) ;
			cur.remove( cur.size() - 1 ) ;
		}
	}
