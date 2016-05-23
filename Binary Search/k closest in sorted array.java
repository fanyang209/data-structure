public int kClosest (int[ ] arr, int k, int k ) {
	if ( arr == null || arr.length == 0 ) {
 		return Integer.MIN_VALUE;
}
	int left = 0 ;
	int right = arr.length - 1 ;
       // if left neighbors right -> terminate
	while ( left < right -1) {  	
		int mid = left + ( right - left ) / 2;
		if ( arr[ mid ] == target ) {
	return target;
} else if ( arr[ mid ] < target ) {
	left = mid ;  // don't add + 1
} else {
	right = mid ;  // don't add - 1
}
}
for ( int i = 0 ; i < k ; i++ ){
     if ( abs ( arr[ left ] ) - target < abs ( arr[ right] ) -   target ) {
    	   left-- ;
	   if ( i == k - 1 )  return left ;
   } else {
    	   right++ ;
	if ( i == k - 1 ) return right ;
   }
   }
  }