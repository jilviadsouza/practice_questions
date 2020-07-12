// addBinary
/*
Given two binary strings, return their sum (also a binary string).

The input strings are both non-empty and contains only characters 1 or 0.
*/

class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        
        int i = a.length() - 1; // pointer
        int j = b.length() - 1;
        int carry = 0;
        
        while(i >= 0 || j >= 0){
            int sum = carry;
            if (i >= 0) sum += a.charAt(i) - '0'; //converting a char to a number
            if (j >= 0) sum += b.charAt(j) - '0';
            sb.append(sum % 2); //mod 2 will turn 1+1 to a 0
            carry = sum/2; 
            
            i--;
            j--;
        }
        if(carry != 0) sb.append(carry); 
        return sb.reverse().toString(); //sb appends to the back
    }
}
