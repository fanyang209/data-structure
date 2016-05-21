public void mergeSort ( int[ ] arr) {
    // check null or empty array
    if ( arr == null || arr.length == 0)
        return;
    int[ ] helper = new int[ arr.length ];
    //  recurse to mergesort
dfs ( arr, helper, 0, arr.length - 1);
}

public void dfs ( int[ ] arr, int[ ] helper, int left, int right ) {
    // base case
    if (left == right ) {
    return;
}
// recursion rule
int mid = left + ( right - left ) / 2;
dfs ( arr, helper, left, mid);
dfs ( arr, helper, mid + 1 , right );
merge ( arr, helper, left, mid, right);
}
