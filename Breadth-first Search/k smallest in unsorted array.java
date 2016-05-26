public int[ ] kSmallest ( int[ ] arr, int k ) {
	if ( arr.length == 0 || k == 0 ) {
	return new int[ 0 ] ; 
}
 	PriorityQueue< Integer> maxheap = new PriorityQueue< Integer>( k, new Comparator<Integer>() ){
	public int compare ( Integer o1, Integer o2 ) {
	if ( o1.equals( o2 ) ) {
	return 0 ;
}
return o1 > o2 ? -1 : 1 ;
}
};
for ( int i = 0; i < arr.length; i++ ) {
	if ( i < k ) {
	maxheap.offer( arr[ i] ) ;
} else if ( arr[ i ] < maxheap.peek() ) {
	maxheap.poll() ;
			maxheap.offer( arr[ i ] ) ;
}
}
int [ ] res = new int[ k ] ;
for ( int i = k - 1; i >= 0; i-- ) {
	res[ i ] = maxheap.poll() ;
}
return res ;
}