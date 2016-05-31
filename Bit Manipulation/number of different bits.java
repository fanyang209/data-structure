public int diffBits( int a, int b ) {
	a ^= b ;
	return countOnes( a ) ;
}

public int countOnes( int a  ) {
	int count = 0 ;
	while( a != 0 ) {
		count += a & 1 ;
		a >>= 1 ;
}
return count ;
}