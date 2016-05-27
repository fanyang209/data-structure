public topKFrequent( String[ ] combo, int k ) {
	if( combo.length == 0 ) {
	return new String[ 0 ] ;
}

Map<String, Integer> freqMap = getFreqMap( combo ) ;
PriorityQueue<Map.Entry<String, Integer>> minHeap = new PriorityQueue<>( k , new Comparator<Map.Entry<String, Integer>>() {
	public int compare( Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2 ) {
	return e1.getValue().compareTo(e2.getValue()) ;
}
} );

for( Map.Entry<String, Integer>> entry : freqMap.entrySet()) {
	if( minHeap.size() < k ) {
	minHeap.offer( entry ) ; 
} else if ( entry.getValue() > minHeap.peek().getValue() ) {
	minHeap.poll() ;
	minHeap.offer( entry ) ;
}
}
return freqArray( minHeap ) ;
}
