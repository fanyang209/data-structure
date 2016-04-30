public class Solution {

    public String getPermutation(int n, int k) {
        int mod = 1;
        List<Integer> candidates = new ArrayList<Integer>();
        // 先得到n!和候选数字列表
        for(int i = 1; i <= n; i++){
            mod = mod * i;
            candidates.add(i);
        }
        // 将k先减1方便整除
        k--;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n ; i++){
            mod = mod / (n - i);
            // 得到当前应选数字的序数
            int first = k / mod;
            // 得到用于计算下一位的k
            k = k % mod;
            sb.append(candidates.get(first));
            // 在列表中移出该数字
            candidates.remove(first);
        }
        return sb.toString();
    }
}