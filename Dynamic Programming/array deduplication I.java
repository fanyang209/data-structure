
public int dedup( int[ ] arr ) {
          	if( arr.length <= 1 ) {
                         	return arr.length ;
}
int fast = 1 ;
int slow = 0 ;
while( fast < arr.length ) {
          	if( arr [ fast ] == arr[ slow ] ) {
                         	fast++ ;
} else {
          	arr[ ++slow ] = arr[ fast++ ] ;
}
}
return slow + 1 ;
}