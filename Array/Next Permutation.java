/*再如，设有排列(p)=2763541，按照字典式排序，它的下一个排列是什么？

2763541 （找最后一个正序35）
2763541 （找3后面比3大的最后一个数4）
2764531 （交换3,4的位置）
2764135 （把4后面的5,3,1反转）
下面给出求 p[1…n] 的下一个排列的描述：

求 i = max{j | p[j – 1] < p[j]} （找最后一个正序）
求 j = max{k| p[i – 1] < p[k]} （找最后大于 p[i – 1] 的）
交换 p[i – 1] 与 p[j]得到 p[1] … p[i-2] p[j] p[i] p[i+1] … p[j-1] p[i-1] p[j+1] … p[n]
反转 p[j] 后面的数得到 p[1] … p[i-2] p[j] p[n] … p[j+1] p[i-1] p[j-1] … p[i]*/

public class Solution {
    public void nextPermutation(int[] nums) {
         // find the last adjacent two element that is in ascending order
         int i = nums.length - 1;
         while(i > 0 && nums[i - 1] >= nums[i]){
             i--;
         }
         
         // if the sequence is already in descending order, reverse the whole sequence
         if(i == 0){
             reverse(nums, 0, nums.length - 1);
             return;
         }
         
          // find the last element that is larger than num[i-1]
          int j = nums.length - 1;
          while(j >= i && nums[i - 1] >= nums[j]){
              j--;
          }
          
          // exchange num[i-1] and num[j]
          int temp = nums[i - 1];
          nums[i - 1] = nums[j];
          nums[j] = temp;
          
          // reverse the sequence after i-1
          reverse(nums, i, nums.length - 1);
          
    }
    
    public void reverse(int[] nums, int start, int end){
        int l = start;
        int r = end;
        while(l < r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
}