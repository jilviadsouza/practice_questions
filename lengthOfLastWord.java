/* lengthOfLastWord

Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word (last word means the last appearing word if we loop from left to right) in the string.

If the last word does not exist, return 0.

Note: A word is defined as a maximal substring consisting of non-space characters only.

*/

class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
      String ss = s.trim();
        
      for(int i = 0; i < ss.length(); i++){
          if(ss.charAt(i) == ' '){
              len = 0;
          }else {
              len++;
          }
                
            }
        return len;
        }
    }
