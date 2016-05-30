"a1b2c4" -> "abbcccc"
// method1 : using StringBuilder
public String deconding( String input ) {
	char[ ] arr = input.toCharArray() ; 
	StringBuilder sb = new StringBuilder() ;
	for( int i = 0; i < arr.length; i++ ) {
		char ch = arr[ i++ ] ;
		int count = arr[ i ] - '0' ;
		for( int c = 0; c < count; c++ ) {
		sb.append( ch ) ;
}
}
return sb.toString() ;
}

// method 2 : in place
public String decoding( String input ) {
	if( input.isEmpty() ) {
	return input ;
}
char[ ] arr = input.toCharArray() ;
return decodeLong( arr, decodeShort( arr )) ;
}

public int decodeShort( char[ ] input ) {
	int end = 0 ;
	for( int i = 0; i < input.length; i += 2 ) {
		int count = getDigit( input[ i + 1 ]) ;
		if( count <= 2 ) {
	for( j = 0; j < count; j++ ) {
	input[ end++ ] = input[ i ] ;
}
} else {
	input[ end++ ] = input[ i ];
	input[ end++ ] = input[ i + 1 ] ;
}
}
return end ;
}

public String decodeLong( char[ ] input, int length ) {
	int newLength = length ;
	// calculate the new whole length
	for( int i = 0; i < length; i++ ) {
	if( isDigit( input[ i ] )) {
	newLength += getDigit( input[ i ] ) - 2 ;
}
}
char[ ] res = new char[ newLength ] ;
int end = newLength - 1 ;
// scan from right to left
for( int i = length - 1; i >= 0; i-- ) {
	if( isDigit( input[ i ] )) {
	int count = getDigit( input[ i-- ] ) ;
	for( int j = 0; j < count; j++ ) {
	res[ end-- ] = input[ i ] ;
}
} else {
	res[ end-- ] = input[ i ] ;
}
}
return new String( res ) ;
}

public int getDigit( char digit ) {
	return digit - '0' ;
}

public boolean isDigit( char digit ) {
	return digit - '0' >= 0 && digit - '0' <= 9 ;
}