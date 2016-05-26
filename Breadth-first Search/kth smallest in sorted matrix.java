Public int kthSmallestInSortedMatrix( int[ ][ ] matrix, int k ) {
		int rows = matrix.length ;
		int cols = matrix[0].length ;
		
		PriorityQueue< Cell > minHeap = new  PriorityQueue< cell > ( k, new Comparator<cell>() {
			public int compare( Cell c1, Cell c2 ) {
				if( c1.value == c2.value ) {
					return 0 ;
				}
				return c1.value < c2.value ? -1 : 1 ;
			}
		});
		boolean[ ][ ] visited = new boolean[ rows ][ cols ] ;
		minHeap.offer( new Cell( 0, 0, matrix[ 0 ][ 0 ])) ;
		visited[ 0 ][ 0 ] = true ;
		for( int i = 0; i < k - 1; k++ ) {
			Cell cur = minHeap.poll() ;
			if( cur.row + 1 < rows && !visited[ cur.row + 1 ][ cur.col ] ) {
				minHeap.offer( new Cell( cur.row + 1, cur.col, matrix[ cur.row + 1 ][ cur.col ] )) ;
				visited[ cur.row + 1][ cur.col ] = true ;
			}
			if( cur.col + 1 < cols && !visited[ cur.row ][ cur.col + 1 ] ) {
				minHeap.offer( new Cell( cur.row, cur.col + 1, matrix[ cur.row ][ cur.col + 1 ] )) ;
				visited[ cur.row ][ cur.col + 1 ] = true ;
			}
		} 
		return minHeap.peek().value ;
	}

	public static Cell {
		int row ;
		int col ;
		int value ;
	
		Cell( int row, int col, int value ) {
			this.row = row ;
			this.col = col ;
			this.value = value ;
		}	
	}