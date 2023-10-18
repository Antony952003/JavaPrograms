package problems;

import java.util.Scanner;

public class perfectsquares {
    static int perfectsquares(int n,int dp[]){
        if(n==0)    return 0;
        if(dp[n]!=-1)   return dp[n];
        int ans = Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++)
        {
            ans = Math.min(ans,1+perfectsquares(n-(i*i),dp));
        }
        return dp[n] = ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dp[] = new int[n+1];
        for(int i=0;i<=n;i++)
        {
            dp[i] = -1;
        }
        int ans = perfectsquares(n,dp);
        System.out.println(ans);

    }   
}
