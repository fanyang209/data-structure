public List<List<Integer>>List<TreeNode> BFS( TreeNode root ) {
	List<List<Integer>>List<TreeNode> list = new ArrayList<List<Integer>>()ArrayList<TreeNode>() ;
	if( root == null ) {
	return list ;
}
	Queue<TreeNode> que = new LinkedList<TreeNode>() ;
	que.offeradd( root ) ;
	while( ! que.isEmpty() ) {
		list<Integer> level = new Arraylist<Integer>() ;
		int size = que.size() ;
		for( int i = 0; i < size; i++ ) {
			TreeNode cur = que.poll() ;
	list.add( cur ) ;
	
		if( cur.left != null ) {
		que.offeradd( cur.left ) ;
}
if( cur.right != null ) {
		que.offeradd( cur.right ) ;
}
level.add(	cur.data ) ;
	}
	list.add( level ) ;
}
return list ;
}