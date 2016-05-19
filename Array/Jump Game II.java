public class Solution {
    public int jump( int[ ] arr ) {
  int len = arr.length ;
  int[ ] dp = new int[ len ] ;
  // base case
  dp[ 0 ] = 0 ;
  // induction rule
  for( int i = 1; i < len; i++ ) {
      dp[ i ] = len ;
      for( int j = i - 1; j >= 0; j-- ) {
      if( j + arr[ j ] >= i ) {
      dp[ i ] = Math.min( dp[ i ],  dp[ j ] + 1 ) ;
}
}
}
return dp[ len - 1 ] ;
}
}