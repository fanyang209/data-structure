public void selectionSort ( int[ ] arr ) {
    // check null or empty array
    if ( arr == null || arr.length == 0)
        return;
    int global_min, temp;
    for ( int i = 0; i < arr.length - 1; i++ ) {
           global_min = i;
// find the min element in the subarray of ( i,  arr.length - 1)
    for (int j = i + 1; j < arr.length; j++) {
    if ( arr[ global_min ] > arr[ j ] ) {
    global_min = j;
}
}
temp = arr[ global_min ] ;
arr[ global_min ] = arr[ i ];
arr[ i ] = temp;
}
}