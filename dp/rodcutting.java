package dp;

import java.util.Scanner;

public class rodcutting {
   /*  static int f(int index,int arr[],int N,int n,int dp[][])
    {
        if(index == 0)
            return N*arr[index];
        if(dp[index][N]!=-1)
            return dp[index][N];
        int nottake = f(index-1, arr, N, n, dp);
        int take = -99999;
        int rodlength = index + 1;
        if(rodlength <= N)
            take = arr[index] + f(index, arr, N- rodlength, n, dp);
        return dp[index][N] = Math.max(take, nottake);
    } */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] =sc.nextInt();
        }
        /* int N = n;
        f(n-1,arr, N, n, dp); */
        /* int dp[] = new int[n+1];

            for(int j=0;j<=n;j++)
            {
                dp[j] = 0;
            }
       // System.out.println(f(n-1,arr,N,n,dp));
       for(int i=0;i<=n;i++)
       {
            dp[i] = i*arr[0];
       }
       for(int i=1;i<n;i++)
       {
        for(int j=n;j>=0;j--)
        {
            int nottake = 0 + dp[j];
            int take = -99999;
            int rodlength = i + 1;
            if(rodlength <= j)
                take = arr[i] + dp[j-rodlength];
            dp[j] = Math.max(take, nottake);
        }
       }
       System.out.println(dp[N]); */
    }
}
