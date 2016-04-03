/*就是搞两个指针，一个指在当前0的最后一个下标，另一个是指在当前1的最后一个下标（2不需要指针因为剩下的都是2了）。进行一次扫描，如果遇到0就两个指针都前进一步并进行赋值，如果遇到1就后一个指针前进一步并赋值。代码如下： */
public class Solution {
    public void sortColors(int[] A) {
    if(A==null || A.length==0)
        return;
    int idx0 = 0;
    int idx1 = 0;
    for(int i=0;i<A.length;i++)
    {
        if(A[i]==0)
        {
            A[i] = 2;
            A[idx1++] = 1;
            A[idx0++] = 0;
        }
        else if(A[i]==1)
        {
            A[i] = 2;
            A[idx1++] = 1;
        }
    }
}
}