public boolean binarySearch ( int[ ][ ] matrix, int target ) {
	if ( matrix == null || matrix.length == 0 || matrix[ 0 ].length == 0 ) {
	return false ;
}
int row = matrix.length ;
int col = matrix[ 0 ].length;
int i = 0 ;
int j = row * col - 1 ;
while ( i <= j ) {
	int mid = i + ( j - i ) / 2 ;
	int r = mid / 2 ;
 	int c = mid % 2 ;
	if ( matrix[ r ][ c ] == target ) {
	return true ;
} else if ( matrix[ r ][ c ] > target ) {
	j = mid - 1 ;
} else {
	i = mid + 1 ;
}
}
return false ;
}