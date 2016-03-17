//  add the first and last element of every row to 1, other elements equals to 
//  corresponding sum of two consecutive elements of previous row 

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> list = new ArrayList<List<Integer>>();
         if(numRows == 0) return list;
         
         
         for(int i = 0; i < numRows; i++){
             
               List<Integer> row = new ArrayList<Integer>();
               row.add(1);
              
              for(int j = 1; j < i; j++){
                  List<Integer> preRow = list.get(i - 1);
                  int temp = preRow.get(j - 1) +  preRow.get(j);
                  row.add(temp);
              }
              
              if(i != 0)
              row.add(1);
              
              list.add(row);
         }
         
         return list;
    }
}