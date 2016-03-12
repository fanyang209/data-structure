public class Solution {  
    public boolean isValidSudoku(char[][] board) {  
        // IMPORTANT: Please reset any member data you declared, as  
        // the same Solution instance will be reused for each test case.  
          
        // rule1, column  
        for(int i=0; i<board[0].length; i++){  
            HashSet<Character> test = new HashSet<Character>();  
            for(int j=0; j<board.length; j++){  
                if(board[j][i]!='.' && test.contains(board[j][i])) return false;  
                else  test.add(board[j][i]);
            }  
        }  
          
        // rule2, row  
        for(int i=0; i<board.length; i++){  
            HashSet<Character> test = new HashSet<Character>();  
            for(int j=0; j<board[0].length; j++){  
              if(board[i][j]!='.' && test.contains(board[i][j])) return false;  
                else  test.add(board[i][j]);
            }  
        }     
          
        // rule3, sub-box  
        for(int i=0; i<3; i++){  
            for(int j=0; j<3; j++){// for each sub-box  
                HashSet<Character> test = new HashSet<Character>();  
                for(int m=i*3; m<i*3+3; m++){//row  
                    for(int n=j*3; n<j*3+3; n++){//column  
                         if(board[m][n]!='.' && test.contains(board[m][n])) return false;  
                         else  test.add(board[m][n]);
                    }  
                }  
            }  
        }  
          
        return true;  
    }  
}  