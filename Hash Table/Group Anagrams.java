public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for(String str : strs){
            // 将单词按字母排序
            char[] carr = str.toCharArray();
            Arrays.sort(carr);
            String key = new String(carr);
            // List<String> list = map.get(key);
            // if(list == null){
            //     list = new ArrayList<String>();
            // }
            // list.add(str);
            // map.put(key, list);
            if(map.containsKey(key)){
                map.get(key).add(str);
            }else{
                map.put(key, new ArrayList<String>());
                map.get(key).add(str);
            }
        }
        List<List<String>> res = new ArrayList<List<String>>();
        // 将列表按单词排序
        for(String key : map.keySet()){
            List<String> curr = map.get(key);
            Collections.sort(curr);
            res.add(curr);
        }
        return res;
    }
}