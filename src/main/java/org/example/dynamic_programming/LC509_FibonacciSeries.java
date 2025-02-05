package org.example.dynamic_programming;

public class LC509_FibonacciSeries {
    public int fibHelper(int n,int dp[]) {
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 1;
        if(dp[n]!=0) return dp[n];
        dp[n]= fibHelper(n-1, dp)+fibHelper(n-2, dp);
        return  dp[n];

    }

    public int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 1;
        int dp[] = new int[n+1];
        dp[0]=0;
        dp[1] = 1;
        dp[2]=1;
        return  fibHelper(n,dp);

    }
}
