package dp;
import java.util.*;
public class stockbuyandsell4transno {
    
        /*stock buy and sell part 3 is about to buy and sell stocks 
     k no of times and get the max profit*/

     /* static int f(int i,int trans,int k,int arr[],int n,int dp[][])
     {
         if(i == n)
             return 0;
        if(trans == 2*k)
            return 0;
        if(dp[i][trans] !=-1)
            return dp[i][trans];
         int profit = 0;
         if(trans % 2 == 0)
         {
             profit = Math.max(-arr[i] + f(i+1,trans+1, k, arr, n,dp),0 + f(i+1, trans, k, arr, n,dp));
         }
         else{
             profit = Math.max(arr[i] + f(i+1, trans+1, k, arr, n,dp),0 + f(i+1, trans, k, arr, n,dp));
         }
         return dp[i][trans] = profit;
     } */
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int trans = 2*k;
        /* int dp[][] = new int[n][trans+1];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=trans;j++)
            {
                dp[i][j] = -1;
            }   
        }  */
        //System.out.println(f(0,0,k,arr,n,dp));
        int front[] = new int[trans+1];
        int cur[] = new int[trans+1];
            for(int j=0;j<=trans;j++)
            {
                front[j] = 0;
            }
        for(int i=n-1;i>=0;i--)
        {
            for(int j=trans-1;j>=0;j--)
            {
                if(j % 2 == 0)
                {
                    cur[j] = Math.max(-arr[i] + front[j+1],0 + front[j]);
                }
                else{
                    cur[j] = Math.max(arr[i] + front[j+1],0 + front[j]);
                }
            }
            front  = cur;
        }
        System.out.println(front[0]); 
     }
}
