package org.example;

import org.example.dynamic_programming.LC40_ClimbingStairs;
import org.example.dynamic_programming.LC509_FibonacciSeries;
import org.example.recursion_backtracking.LC39_CombinationSum;

public class Main {
    public static void main(String[] args) {
//         Climbing Stairs LeetCode 40
        LC40_ClimbingStairs climbingStairs = new LC40_ClimbingStairs();
        System.out.println(climbingStairs.climbStairs(5));
        LC509_FibonacciSeries fibonacciSeries = new LC509_FibonacciSeries();
        System.out.println(fibonacciSeries.fib(30));
        LC39_CombinationSum combinationSum = new LC39_CombinationSum();
        System.out.println(combinationSum.combinationSum(new int[]{2,3,6,7},7));
        System.out.println("Code Ran Successfully , Check results");

    }
}