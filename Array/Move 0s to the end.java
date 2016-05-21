public int [ ] moveZero ( int [ ] arr) {
	// check null or empty
	if ( arr == null || arr.length == 0) {
	return arr;
}
int left = 0;
int right = arr.length - 1 ;
while ( left <= right ) {
	if ( arr [ left ] != 0 ) {
	left++ ;
} else if ( arr [ right ] == 0 ) {
right-- ;
} else {
	swap (arr, left++, right-- ) ;
}
}
return arr ;
}

public void swap ( int [ ] arr, int left, int right ) {
	int temp = arr [ left ] ;
	arr [ left ] = arr [ right ] ;
	arr [ right ] = temp ;
}