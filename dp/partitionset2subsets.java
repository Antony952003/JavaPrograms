package dp;

import java.util.Scanner;

public class partitionset2subsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(2^3^4^5);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int target = 0;
        for(int i=0;i<n;i++)
        {
            target += arr[i];
        }
        boolean dp[][] = new boolean[n][target+1];
        for(int i=0;i<n;i++)
        {
            dp[i][0] = true;
        }
        dp[0][arr[0]] = true;
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<=target;j++)
            {
                boolean nottake = dp[i-1][j];
                boolean take =false;
                if(arr[i] <= j)
                {
                    take = dp[i-1][j-arr[i]];
                }
                dp[i][j] = nottake | take;
            }
        }
        int min = 999999;
        for(int i=0;i<=target;i++)
        {
            if(dp[n-1][i])
                min = Math.min(min,Math.abs(i - (target - i))); 
        }
        System.out.println(min);
    }
}
