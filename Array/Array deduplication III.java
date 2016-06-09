public int dedup( int[ ] arr ) {
	if( arr.length <= 1 ) {
	return arr.length ;
}
int slow = 0 ;
boolean flag = false ;
for( int i = 1; i < arr.length; i++ ) {
	if( arr[ i ] = arr[ slow ] ) {
		flag = true ;
} else if ( flag == false) {
	arr[ ++slow ] = arr[ i ] ;	
} else {
	arr [ slow ] = arr[ i ] ;
	flage = false ;
}
}
return flag ? slow : slow + 1 ;
}