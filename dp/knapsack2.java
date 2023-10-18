package dp;

import java.util.Scanner;

public class knapsack2 {
   /*  static int f(int index,int target,int arr[],int val[],int n)
    {
        if(index == n-1)
        {
            return (target/arr[index])*val[index];
        }
        int nottake = 0 + f(index+1, target, arr,val, n);
        int take = -99999;
        if(arr[index] <= target)
            take = val[index] + f(index, target - arr[index], arr, val, n); 
        return Math.max(nottake, take);
    } */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int val[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] =sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            val[i] =sc.nextInt();
        }
        int target = sc.nextInt();
        //System.out.println(f(0,target,arr,val,n));
        int dp[] = new int[target+1];
        for(int i=0;i<=target;i++)
        {
            dp[i] = (i/arr[0])*val[0];
        }
        for(int i=1;i<n;i++)
        {
            for(int j=target;j>=0;j--)
            {
                int nottake = 0 + dp[j];
                int take = -99999;
                if(arr[i] <= j)
                    take = val[i] + dp[j-arr[i]];
                dp[j] = Math.max(nottake, take);  
            }
        }
        System.out.println(dp[target]);
    }
}
/* 
5 13
7 9 1 3 10 
5 5 7 7 7  */