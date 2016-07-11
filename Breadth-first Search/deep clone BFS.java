public GraphNode cloneGraph(GraphNode head ) {
          	if( head == null ) {
                         	return null ;
}
Map< GraphNode , GraphNode > map = new HashMap< GraphNode , GraphNode >() ;
Queue< GraphNode > qu = new LinkedList< GraphNode >() ;
qu.offer( head ) ;
GraphNode copyHead = new GraphNode( head.val ) ;
map.put( head, copyHead ) ;
while( !qu.isEmpty() ) {
          	GraphNode cur = qu.poll() ;
          	// check each neighbors
          	for(GraphNode node : cur.neighbors ) {
                         	// if not visited, then add to queue
                         	if( !map.containsKey( node ) ) {
                                       	qu.offer( node ) ;
                                       	map.put( node, new GraphNode( node.val ) ) ;
}
// copy current node’s neighbors from hashmap
map.get( cur ).neighbors.add( map.get( node ) ) ;
}
}
return copyHead ;
} 