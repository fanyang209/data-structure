public String removeChar( String input, String t ) {
		char[ ] arr = input.toCharArray() ;
		int slow = 0 ;
		int fast = 0 ;
		Set<Character> set = buildSet(t);
		
		while( fast < arr.length ) {
			if(!set.contains(arr[ fast ])) {
				arr[ slow++ ] = arr[ fast++ ] ;
			} else {
				fast++ ;
			}
		}
		return new String( arr, 0, slow ) ;
	}
	
	public Set<Character> buildSet( String t ) {
		Set<Character> set = new HashSet<Character>() ;
		for( int i = 0; i < t.length(); i++ ) {
			set.add( t.charAt(i)) ;
		}
		return set ;
	} 