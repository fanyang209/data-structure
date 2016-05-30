//  iterative
	public String reverse( String input ) {
		if( input == null || input.length() <= 1 ) {
			return input ;
		}
		char[ ] arr = input.toCharArray() ;
		int i = 0;
		int j = arr.length - 1 ;
		while( i != j ) {
			swap(arr, i, j ) ;
			i++;
			j--;
		}
		return arr.toString ;
	}

	public void swap( char[ ] arr, int i, int j ) {
		int temp = i ;
		i = j ;
		j = temp ;
	}

	//  recursive
	public String reverse( String input ) {
		if( input == null || input.length() <= 1 ) {
			return input ;
		}
		char[ ] arr = input.toCharArray() ;
		reverseHelper( arr, 0, arr.length - 1 ) ;
		return new String( arr ) ;
	}

	public void reverseHelper( char[ ] arr, int left, int right ) {
		if( left >= right ) {
			return ;
		}
		swap(arr, left, right ) ;
		reverseHelper( arr, left + 1, right -1 ) ;
	}