public String renoveChar( String input ) {
		if( input == null || input.length == 0 || input.length == 1 ) {
			return input ;
		}
		char[ ] arr = input.toCharArray() ;
		int slow = 0;
		int fast = 0 ;
		while( fast < arr.length ) {
			if( arr[ slow ] == arr[ fast ] ) {
				fast++ ;
			} else {
				arr[ ++slow ] = arr[ fast++ ] ;
			}
		}
		return new String(arr, 0, slow ) ;
	}