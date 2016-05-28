public String removeSpace( String input ) {
		if( input.isEmpty() ) {
			return input ;
		}
		char[ ] arr = input.toCharArray() ;
		int slow = 0 ;
		int fast = 0 ;
		int word_count = 0 ;
		while( fast < arr.length ) {
			while( arr[ fast ] == ' ' ) {
				fast++;
			}
			if( word_count > 0 ) {
				arr[ slow++ ] = ' ' ;
			}
			while( arr[ fast] != ' ' ) {
				arr[ slow++ ] = arr[ fast++ ] ;
			}
			word_count++ ;
		}
		return new String( arr, 0, slow ) ;
		
	}