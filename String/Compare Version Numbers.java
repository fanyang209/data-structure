public class Solution {
    public int compareVersion(String version1, String version2) {
        String delimiter = "\\.";
        String[] v1 = version1.split(delimiter);
        String[] v2 = version2.split(delimiter);
        int len = Math.max(v1.length, v2.length);
        for(int i = 0; i < len; i++){
            if(i < v1.length && i < v2.length){
                if(Integer.parseInt(v1[i]) > Integer.parseInt(v2[i])){
                    return 1;
                }else if(Integer.parseInt(v1[i]) < Integer.parseInt(v2[i])){
                    return -1;
                }
            }else if(i < v1.length){
                if(Integer.parseInt(v1[i]) > 0){
                    return 1;
                }
            }else if(i < v2.length){
                if(Integer.parseInt(v2[i]) > 0){
                    return -1;
            }
        }
    }
    
    return 0;
}
}