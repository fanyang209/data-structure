public List<List<Integer>> layerBylayer ( TreeNode root ) {
	List<Integer> level = new ArrayList<Integer>() ;
	if ( root == null ) {
	return list ;
}

Queue<TreeNode> queue = new LinkedList<TreeNode>() ;
queue.offer( root ) ;
while ( !queue.isEmpty() ) {
List<Integer> level = new ArrayList<Integer>() ;
	int size = queue.size() ;
	for( int i = 0; i < size; i++ ) {
		TreeNode cur = queue.poll() ;
		if ( cur.left != null ) {
		queue.offer( cur.left ) ;
}
if ( cur.right != null ) {
	queue.offer( cur.right ) ;
}
level.add( cur.key ) ;
	}
	list.add( level ) ;
}
return list ;
}