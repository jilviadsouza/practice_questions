// ClimbingStairs
/*
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.
*/

class Solution {
    public int climbStairs(int n) {
        
        if(n <= 1){
            return 1;
        }
        
        int[] ways = new int[n+1]; //cause youre counting 0th 
        
        ways[0] = 1;
        ways[1] = 1;
        
        for(int i = 2; i <= n; i++){
            ways[i] = ways[i - 2] + ways[i - 1];
        }
        
        return ways[n];
    }
}

/*

ex. if i = 3
ways[3] = ways[3 - 2] + ways[3 - 1]
        = ways[1] + ways[2]
        = 1 + 2
        = 3 
*/