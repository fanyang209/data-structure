public class Solution {
    public int lengthOfLIS(int[] nums) {
    if(nums.length==0){
        return 0;
    }

    int[] result = new int[nums.length+1];
    int currentLength = 0;
    result[0] = Integer.MIN_VALUE;
    for(int i = 0;i<nums.length;i++){
        int pre = binarySearch(result,0,currentLength,nums[i]);
        if(result[pre]==nums[i]){
            continue;
        }
        result[++pre] = nums[i];
        if(pre>currentLength){
            currentLength =pre;
        }
    }
    return currentLength;
}

public  int binarySearch(int[] a, int p, int r, int t){
    while(p<=r){
        int q = (p+r)/2;
        if(t<a[q]){
            r = q-1;
        }else{
            p = q+1;
        }
    }
    return r;
}
}