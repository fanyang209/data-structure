public int dedup( int[ ] arr ) {
	if( arr.length <= 1 ) {
		return arr.length ;
}
int slow = 0 ;
int fast = 1 ; 
while( fast < arr.length ) {
	if( arr[ slow ] == arr[ fast ] ) {
		fast++ ;
} else {
	arr[ ++slow ] = arr[ fast++ ] ;
}
}
return slow + 1 ;
}