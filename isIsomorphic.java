/* isIsomorphic

Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

Example 1:

Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false
Example 3:

Input: s = "paper", t = "title"
Output: true
Note:
You may assume both s and t have the same length.


*/

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length() != t.length()) 
            return false;
        
        //using hashmaps to store mappings
        //and a hashset to keep track of the chars already mapped
        
        Map<Character, Character> map = new HashMap<>(); 
        
        Set<Character> set = new HashSet<>();
        
        //traverse strings
        for(int i = 0; i < s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            
            //if c1 was already mapped 
            if(map.containsKey(c1)){
                //but to a different char
                if(map.get(c1) != c2){
                    return false;
                }
                // if map is empty
            }else {
                //but the set isnt (if c2 has been previously mapped to a different char)
                if(set.contains(c2))
                    return false;
            }
            // all conditions passed. add chars into the map and set
            map.put(c1, c2);
            set.add(c2);
        }
        return true;
    }
}