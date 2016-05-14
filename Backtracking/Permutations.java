public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        int i = 0;
        do{
            // turn every permutation to a list and add it to the answer
            List<Integer> list = new ArrayList<Integer>();
            for(int x : nums){
                list.add(x);
            }
            ans.add(list);
            
             // get next permutation
            nextPermutation(nums);
            
        }while(++i < factorial(nums.length));
        
        return ans;   
    }
    
    public void nextPermutation(int[] nums) {
        // find the last adjacent two element that is in ascending order
        int i = nums.length - 1;
        while (i > 0 && nums[i - 1] >= nums[i]) {
            i--;
        }
        
        // if the sequence is already in descending order, reverse the whole sequence
        if (i == 0) {
            reverse(nums, 0, nums.length - 1);
            return;
        }
        
        // find the last element that is larger than num[i-1]
        int j = nums.length - 1;
        while (j >= i && nums[i - 1] >= nums[j]) {
            j--;
        }
        
        // exchange num[i-1] and num[j]
        int tmp = nums[i - 1];
        nums[i - 1] = nums[j];
        nums[j] = tmp;
        
        // reverse the sequence after i-1
        reverse(nums, i, nums.length - 1);
    }
    
    
    public void reverse(int[] nums, int start, int end) {
        int l = start;
        int r = end;
        while (l < r) {
            int tmp = nums[l];
            nums[l] = nums[r];
            nums[r] = tmp;
            l++;
            r--;
        }
    }
    
    public int factorial(int n) {  
        return (n == 1 || n == 0) ? 1 : factorial(n - 1) * n;  
    }  
}