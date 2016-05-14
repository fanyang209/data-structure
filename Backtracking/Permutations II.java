public class Solution {
    public List<List<Integer>> permuteUnique(int[] num) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        
        // make the permutation strat from ascending order
        Arrays.sort(num);
        
        do {
            // turn every permutation to a list and add it to the answer
            List<Integer> list = new ArrayList<Integer>();
            for (int x : num) {
                list.add(x);
            }
            ans.add(list);
            
        } while (nextPermutation(num));
        
        return ans;
    }
    
    
    public boolean nextPermutation(int[] num) {
        // find the last adjacent two element that is in ascending order
        int i = num.length - 1;
        while (i > 0 && num[i - 1] >= num[i]) {
            i--;
        }
        
        // if all permutations have been found
        if (i == 0) return false;
        
        // find the last element that is larger than num[i-1]
        int j = num.length - 1;
        while (j >= i && num[i - 1] >= num[j]) {
            j--;
        }
        
        // exchange num[i-1] and num[j]
        int tmp = num[i - 1];
        num[i - 1] = num[j];
        num[j] = tmp;
        
        // reverse the sequence after i-1
        reverse(num, i, num.length - 1);
        
        return true;
    }
    
    
    public void reverse(int[] num, int start, int end) {
        int l = start;
        int r = end;
        while (l < r) {
            int tmp = num[l];
            num[l] = num[r];
            num[r] = tmp;
            l++;
            r--;
        }
    }
}