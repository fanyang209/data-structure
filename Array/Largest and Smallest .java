public pair largestAndSmallest( int[ ] arr ) {
	List<Integer> larger = new ArrayList<Integer>() ;
	List<Integer> smaller = new ArrayList<Integer>() ;
	for( int i = 0; i < arr.length; i++ ) {
		if( i == arr.length - 1 ) {
			larger.add( arr[ i ] ) ;
			smaller.add( arr[ i ] ) ;
} else if( arr[ i ] <= arr[ i + 1 ] ) {
	larger.add( arr[ i + 1] ) ;
	smaller.add( arr[ i ] ) ;
} else {
	larger.add( arr[ i ] ) ;
	smaller.add( arr[ i + 1 ] ) ;
}
}
return new pair( largest( larger ), smallest( smaller ) ) ;
}

public int largest( List<Integer> larger ) {
	int largest = larger.get( 0 ) ;
	for( int num : larger ) {
	if( num > largest ) {
	largest = num ;
}
}
return largest ;
}

public int smallest( List<Integer> smaller ) {
	int smallest= smaller .get( 0 ) ;
	for( int num : smaller ) {
	if( num < smallest) {
	smallest = num ;
}
}
return smallest ;
}  