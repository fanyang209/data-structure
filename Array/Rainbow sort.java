public int [ ] rainbowSort ( int [ ] arr ) {
	if ( arr == null || arr.length <= 1 ) {
	return arr ;
}

int neg = 0;
int one = arr.length - 1;
int zero = 0 ;
while ( zero <= one ) {
	if ( arr [ zero ] == - 1) {
	swap ( arr, neg++, zero++) ;
} else if ( arr [ zero ] == 0 ) {
zero++ ; 
} else {
	swap ( arr, zero++, one-- ) ;
}
}
return arr; 
}
public void swap ( int [ ] arr, int a, int b ) {
	int temp = arr [ a ] ;
	arr [ a ] = arr [ b ] ;
	arr [ b ] = temp;
}