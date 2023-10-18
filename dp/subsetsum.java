package dp;

import java.util.ArrayList;
import java.util.Scanner;

public class subsetsum {
   /*  static int f(int index,int target,int arr[],int dp[][])
    {
        if(target==0)
        {
            return 1;
        }
        if(index == arr.length-1)
        {
            if(target == arr[index]){
                return 1;
            }
            else
                return 0;
        }
        if(dp[index][target] !=-1)
        {
            return dp[index][target];
        }
        int nottake = f(index+1, target, arr,dp);
        int take = 0;
        if(arr[index] <= target)
        {
            take = f(index+1, target - arr[index] ,arr,dp);
        }
        if(take == 1 || nottake == 1)
            return dp[index][target]  = 1;
        return 0;
    } */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
       /*  boolean dp[][] = new boolean[n][target+1];
        //ArrayList<Integer> ar = new ArrayList<>();
        //System.out.println(f(0,target,arr,dp));
        for(int i=0;i<n;i++)
            dp[i][0] = true;
        dp[0][arr[0]] = true;
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<=target;j++)
            {
                boolean nottake = dp[i-1][j];
                boolean take = false;
                if(arr[i] <= j)
                {
                    take = dp[i-1][j-arr[i]];
                }
                if(take || nottake)
                    dp[i][j] = true;
                else
                dp[i][j] = false;
            }
        }
        System.out.println(dp[n-1][target]); */
        boolean front[] = new boolean[target+1];
        boolean curr[] = new boolean[target+1];
        
        front[0] = true;
        curr[0] = true;
        front[arr[0]] = true;
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<=target;j++)
            {
                boolean nottake = front[j];
                boolean take = false;
                if(arr[i] <= j)
                {
                    take = front[j-arr[i]];
                }
                curr[j] = take | nottake;
            }
            front = curr;
        }
        System.out.println(front[target]);

    }
}
