public class Solution {
    public int hIndex(int[] citations) {
       // Arrays.sort(citations);
        int h = 0;
        for(int i = 0; i < citations.length; i++){
            // 得到当前的H指数
            int curH = Math.min(citations[i], citations.length - i);
            if(curH > h){
                h = curH;
            }
        }
        return h;
    }
}