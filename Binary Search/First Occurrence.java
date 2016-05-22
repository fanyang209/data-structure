public int firstOccur ( int[ ] arr, int target ) {
	if ( arr == null || arr.length == 0 ) {
	return -1 ;
}
int left = 0 ;
int right = arr.length - 1 ;
while ( left <=  right left < right - 1) {
	int mid = left + ( right - left ) / 2 ;
	if ( arr[ mid ] == target ) {
	right = mid ; // keep checking to left
} else if ( arr[ mid ] < target ) {
	left = mid ;
} else {
	right = mid ;
}
}
if ( arr[ left ] == target ) {
	return left ;
}
if ( arr[ right] == target ) {
	return right;
}
return -1;
}