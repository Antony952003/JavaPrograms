package dp;

import java.util.Scanner;

public class knapsack {
   /*  static int f(int index,int wt[],int val[],int bag,int dp[][])
    {
        if(index == wt.length-1)
        {
            if(wt[index] <= bag)
                return val[index];
            else return 0;
        }
        if(dp[index][bag] != -1)
            return dp[index][bag];
        int nottake = 0 + f(index+1, wt, val,bag,dp);
        int take = -99999;
        if(wt[index] <= bag)
            take = val[index] + f(index+1, wt, val, bag - wt[index],dp);
        return dp[index][bag] = Math.max(take, nottake);
    } */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int wt[] = new int[n];
        int val[] = new int[n];
        for(int i=0;i<n;i++)
        {
            wt[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            val[i] = sc.nextInt();
        }
        int bag = sc.nextInt();
         //int dp[][] = new int[n][bag+1];
        /*for(int i=0;i<n;i++)
        {
            for(int j=0;j<=bag;j++)
            {
                dp[i][j] = -1;
            }
        } */
       // System.out.println(f(0,wt,val,bag,dp));
       int prev[] = new int[bag+1];
       int curr[] = new int[bag+1];
       for(int i=0;i<=bag;i++)
        {
            prev[i] = 0;
            curr[i] = 0;
        }
       for(int i=wt[0];i<=bag;i++)
       {
            prev[i] = val[0];
       }
       for(int i=1;i<n;i++)
       {
        for(int j=bag;j>=0;j--)
        {
            int nottake = 0 + prev[j];
            int take = -99999;
            if(wt[i] <= j)
                take = val[i] + prev[j-wt[i]];
            prev[j] = Math.max(take, nottake);
        }
       }
       System.out.println(prev[bag]);
    }
}
