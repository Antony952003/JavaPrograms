package dp;

import java.util.Scanner;

public class countsubsetsofsum {
    static int f(int index,int target,int arr[],int dp[][])
    {
        if(target == 0)
            return 1;
        if(index == arr.length-1)
        {
            if(arr[index] == target)
                return 1;
            else    
                return 0;
        }
        if(dp[index][target] !=-1)
            return dp[index][target];
        int nottake = f(index+1, target, arr,dp);
        int take = 0;
        if(arr[index] <= target)
            take = f(index+1, target - arr[index], arr,dp);
        return dp[index][target] = nottake + take;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int dp[][] = new int[n][target+1];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=target;j++)
            {
                dp[i][j] = -1;
            }
        }
        System.out.println(f(0,target,arr,dp));

        /* int dp[][] = new int[n][target+1];
        for(int i=0;i<n;i++)
        {
            dp[i][0] = 1;
        }
        if(arr[0] < target)  dp[0][arr[0]] = 1;
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<=target;j++)
            {
                int nottake = 0 + dp[i-1][j];
                int take = 0;
                if(arr[i] <= j)
                    take = dp[i-1][j-arr[i]];
                dp[i][j] = take + nottake;
            }
             //           6
           // 86 4 2 5 4 7
           //9
        }
        System.out.println(dp[n-1][target]); */
    }
}
