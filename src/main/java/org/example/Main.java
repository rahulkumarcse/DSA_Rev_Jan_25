package org.example;

import org.example.dynamic_programming.LC40_ClimbingStairs;
import org.example.dynamic_programming.LC509_FibonacciSeries;

public class Main {
    public static void main(String[] args) {
        // Climbing Stairs LeetCode 40
        LC40_ClimbingStairs climbingStairs = new LC40_ClimbingStairs();
        System.out.println(climbingStairs.climbStairs(5));
        LC509_FibonacciSeries fibonacciSeries = new LC509_FibonacciSeries();
        System.out.println(fibonacciSeries.fib(30));
        System.out.println("Code Ran Successfully , Check results");

    }
}