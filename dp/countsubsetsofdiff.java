package dp;

import java.util.Scanner;

public class countsubsetsofdiff {
    static int f(int index,int target,int arr[],int n,int dp[][])
    {
        if(index == arr.length-1)
        {
            if(target == 0 && arr[index] == 0)
                return 2;
            if(target == 0 || target == arr[index])
                return 1;
            return 0;
        }
        if(dp[index][target] != -1)
            return dp[index][target];
        int nottake = f(index+1, target, arr, n,dp);
        int take = 0;
        if(arr[index] <= target)
            take = f(index+1, target - arr[index], arr, n,dp);
        return dp[index][target] =  take + nottake;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int totsum = 0;
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            totsum += arr[i];
        }        
        int d = sc.nextInt();
        int target = (totsum-d)/2;
        int dp[][] = new int[n][target+1];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=target;j++)
            {
                dp[i][j] = -1;
            }
        }
        if((totsum -d) < 0 ||(totsum -d)%2!=0)
            return;
        System.out.println(f(0,target,arr,n,dp));


    }
}
