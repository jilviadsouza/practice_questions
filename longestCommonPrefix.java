// Longest Common Prefix
/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".
*/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0){
            return "";
        }
        
        String prefix = strs[0]; //output, starting at first word
     //  0,         1,      2
    // ["flower","flow","flight"]
        
        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){ // if prefix matches strs[i] in its first occurence 
                prefix = prefix.substring(0, prefix.length() - 1); //decrease the length of prefix by 1
            }
                
        }
        return prefix;
      }  
    }
