public String replace( String input, String s, String t ) {
	if( s.length() >= t.length() ) {
	return replaceShorter( input, s, t ) ;
} else {
	return replaceLonger( input, s, t ) ;
}
}

public String replaceShorter( String input, String ori, String short ) {
	char[ ] arr = input.toCharArray() ; 
	int slow = 0 ;
	int fast = 0 ;
	while( fast < input.length() ) {
	if ( fast <= input.length() - ori.length() && equalSubArray( input, fast, ori ) ) {
copyFromLeft( arr, slow, short ) ;
slow += short.length() ;
fast += ori.length() ;	
} else {
	arr[ slow++ ] = arr[ fast++ ] ;
}
}
return new String( arr, 0, slow ) ;
}

public String replaceLonger( String input, String ori, String long ) {
	ArrayList<Integer> matches = new ArrayList<Integer> () ;
	for( int i = 0; i <= input.length() - ori.length() ) {
	if( equalSubArray( input, i, ori )) {
	matches.add( i + ori.length() - 1 ) ;
	i += s.length() ;
} else {
	i++ ;
}
}
int newLength = input.length() + matches.size() * ( long.length() - ori.length() ) ;
char[ ] res = new char[ newLength ] ;
int lastIndex = matches.size() - 1;
int end = newLength - 1 ;
for( int i = input.length() - 1; i >= 0; ) {
    if( lastIndex >= 0 && i == matches.get( lastIndex )) {
	copyFromRight( res, end, long ) ;
	lastIndex-- ;
	i -= s.length() ;
	end -= t.length() ;
   } else {
	res[ end-- ] = input.charAt( i-- ) ;
   }
} 
return new String( res ) ;
}

public boolean equalSubArray( String input, int index, String s ) {
	for( int i = 0; i < s.length(); i++ ) {
	if( input.charAt( index + i) != s.charAt( i )) {
	return false ;
}
}
}

public void copyFromLeft( char[ ] arr, int index, String t ) {
	for( int i =0 ; i < t.length() ; i++ ) {
	arr[ index++ ] = t.charAt( i ) ;
}
}

public void copyFromRight( char[ ] arr, int index, String t ) {
	for( int i = t.length() - 1; i >= 0; i-- ) {
		arr[ index-- ] = t.charAt( i ) ;
} 
} 