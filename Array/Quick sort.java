public int[ ] quickSort (int[ ] arr) {
    // check null 
    if ( arr == null ) return arr;
    quickSort ( arr, 0, arr.length - 1 );
    return arr;
}

public void quickSort (int[ ] arr, int left, int right ) {
    // base case 
    if (left == right) {
    return;
}

// define a pivot and find the position which all the left // elements smaller than pivot and all the right elements  //bigger than the pivot
int pivot = partition (arr, left, right );

// recursive rule 
quickSort ( arr, left, pivot - 1 ) ;
quickSort ( arr, pivot + 1, right ) ;
}

public int partition ( int [ ] arr, int left, int right ) {
    // pick a random element in the range of [left, right]
    int pivotIndex = pivotIndex ( left, right) ;
    int pivot = arr [ pivotIndex ] ;
    // swap the pivot element to the rightmost position first
    swap ( arr, pivotIndex, right );
    int leftBound = left ;
    int rightBound = right - 1 ;
    while ( leftBound <= rightBound ) {
        if ( arr [ leftBound ] < pivot ) {
    leftBound++ ;
} else if ( arr [ rightBound ] >= pivot ) {
    rightBound-- ;
} else {
    swap ( arr, leftBound++, rightBound-- ) ;
}
}
// swap back the pivot element
swap ( arr, leftBound, right ) ;
return leftBound ;
}

public int pivotIndex ( int left, int right ) {
    return left + (int) (Math.random() * ( right - left + 1)) ;
}

public void swap ( int [ ] arr, int left, int right ) {
    int temp = arr [ left ] ;
    arr [ left ] = arr [ right ] ;
    arr [ right ] = temp;
}