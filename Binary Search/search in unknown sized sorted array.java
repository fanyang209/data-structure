public int unknownArray ( int[ ] arr, int target ) {
	if ( arr == null || arr.length == 0 ) {
	return -1 ;
}
int left = 0 ;
int right = 1 ;
// find the rightmost bound
while ( arr[ right ] != null && arr[ right ] < target ) {
	left = right ;
	right *= 2 ;
}
return unknownArray ( arr, target, left, right ) ;
}

// classical binary search
public int unknownArray ( int[ ] arr, int target, int left, int right ) {
  while ( left <= right ) {
	int mid = left + ( right - left ) / 2 ;
	if ( arr[ mid ] == target ) {
	return mid ;
} else if ( arr[ mid ] < target ) {
	left = mid + 1 ;
} else if ( arr[ mid ] > target || arr[ mid] == null ) {
	right = mid - 1 ;
}
  }
	return -1 ; 
}