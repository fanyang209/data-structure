public TreeNode LCA( TreeNode one, TreeNode two ) {
	int l1 = length( one ) ;
	int l2 = length( two ) ;
	if( l1 <= l2 ) {
	return llc( one, two , l2 - l1 ) ;
} else {
	return llc( two, one, l1 - l2 ) ;
}
}

public TreeNode llc( TreeNode small, TreeNode large, int diff ) {
	while( diff > 0 ) {
	large = large.parent ;
	diff -- ;
}
while( large != small ) {
	large = large.parent ;
	small = small.parent ;
}
return large ;
}

public int length( TreeNode node ) {
	int length = 0 ;
	while( node != null ) {
		length ++ ;
		node = node.parent ;
}
return length ;
}