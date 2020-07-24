//countPrimes
/*
Count the number of prime numbers less than a non-negative number, n.
*/

class Solution {
    public int countPrimes(int n) {
        
       int count = 0; 
        
        boolean[] nums = new boolean[n];
        
      for(int i = 2; i < nums.length; i++){
          
            if(!nums[i]){
                count++;
                
     for(int j = i*2; j < nums.length; j = j+i){
            nums[j] = true;
            } 
         }
       }
        return count;
    }
}
