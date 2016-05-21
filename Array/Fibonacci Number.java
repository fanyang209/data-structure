public long fibo ( int n ) {
	// base case 
	if ( n == 0 || n == 1) {
	return n ;
}
// recursive rule
return fibo (n - 1) + fibo (n - 2) ;
}