package org.example.dynamic_programming;

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * Example 1:
 * Input: n = 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * Example 2:
 * Input: n = 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step*
 * Constraints:
 * 1 <= n <= 45
 */
public class LC40_ClimbingStairs {
    private int climbStairsHelper(int n, int current){
        if(current>=n){
            if(current==n) return 1;
            return 0;
        }
        int stepFirst = climbStairsHelper(n, current+1);
        int stepTwo = climbStairsHelper(n,current+2);
        return stepTwo+stepFirst;
    }
    public int climbStairs(int n) {
        int result;
        result = climbStairsHelper(n,0);
        return result;
    }
}
