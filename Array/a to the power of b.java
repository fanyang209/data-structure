public long pow ( int a, int b) {
	// base case
	if ( b == 0) {
	return 1;
} else if ( b == 1) {
	return a;
}
// recursive rule
int half = pow ( a, b / 2) ;
return b % 2 == 0 ? half * half : half * half * a ;
}
