public List<String> subSets( String set ) {
	List<String> res = new ArrayList<String>() ;
	if( set == null ) {
		return res ;
	}
	char[ ] arrayset = set.toCharArray() ;
	StringBuilder sb = new StringBuilder() ;
	helper( arrayset, sb, 0, res ) ; 
	return res ;
  } 

  public void helper( char[ ] arrayset, StringBuilder sb, int index, List<String> res ) {
	// base case
	if( index == arrayset.length ) {
		res.add( sb.toString() ) ;
		return ;
	}

	// recursive rule
	helper( arrayset, sb, index + 1, res ) ;
	helper( arrayset, sb.append( arrayset[ index ]), index + 1, res ) ;
	sb.deleteCharAt( sb.length() - 1 ) ;	
  }