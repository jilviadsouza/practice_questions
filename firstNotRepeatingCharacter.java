/* firstNotRepeatingCharacter.java

Given a string s consisting of small English letters, find and return the first instance of a non-repeating character in it. If there is no such character, return '_'.

Example

For s = "abacabad", the output should be
firstNotRepeatingCharacter(s) = 'c'.

There are 2 non-repeating characters in the string: 'c' and 'd'. Return c since it appears in the string first.

For s = "abacabaabacaba", the output should be
firstNotRepeatingCharacter(s) = '_'.

There are no characters in this string that do not repeat.
*/

/* First Attempt: Brute Force. 
run time: O(n^2) not optimal at all. 
*/


char firstNotRepeatingCharacter(String s) {

for(int i = 0; i < s.length(); i++){
    boolean seen = false;
    for(int j = i+1; j < s.length(); j++){
        if((s.charAt(i) == s.charAt(j)) && (i != j)) {
            seen = true;
            break;
        }  
    }
    if(!seen) return s.charAt(i);
}
return '_';
}

/* Second Attempt: HashMap (key: char, value: # of times it occurs (int))
objective: return first non-repeating char. it only occurs ONCE.
this code, first loops over the string. if the hashmap already contains c, then put the the duplicate and icrements the count number. if the hashmap doesnt, it puts in the char and 1 is the count. 

second loop to 'look up' the key and value in the hashmap (takes O(1) time)
if count == 1, return the char. if no duplicates found, return '_' 

total worst case run time is O(2n), drop constant and it becomes o(n)

*/

char firstNotRepeatingCharacter(String s) {

HashMap<Character, Integer> char_count = new HashMap<>();

for(int i = 0; i <s.length(); i++){
    char c = s.charAt(i);
    if(char_count.containsKey(c)){
        char_count.put(c, char_count.get(c) + 1);
    } else {
        char_count.put(c, 1);
    }
}

for(int i = 0; i < s.length(); i++){
    char c = s.charAt(i);
    if(char_count.get(c) == 1) return c;
}
return '_';
}
