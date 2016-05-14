/*先将数组排序，我们就可以知道对于某个引用数，有多少文献的引用数大于这个数。对于引用数citations[i]，大于该引用数文献的数量是citations.length - i，而当前的H-Index则是Math.min(citations[i], citations.length - i)，我们将这个当前的H指数和全局最大的H指数来比较，得到最大H指数。*/
public class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
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