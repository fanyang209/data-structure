public int dedup( int[ ] arr ) {
          	if( arr.length <= 2 ) {
                         	return arr.length ;
}
int fast = 2;
int slow = 2;
while( fast < arr.length; i++ ) {
          	if( arr[ fast ] != arr[ slow – 2 ] ) {
                         	arr[ slow++ ] = arr[ fast++ ] ;
} else {
          	fast++ ;
}
}
return slow ;
}