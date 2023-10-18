package dp;
import java.util.*;
public class stockbuyandsell2 {
    /*stock buy and sell part 2 is about to buy and sell stocks 
    unlimited no of times and get the max profit*/
    
    
    /* static int f(int i,int buy,int arr[],int n,int dp[][])
    {
        if(i == n)
            return 0;
        int profit = 0;
        if(dp[i][buy] != -1)
            return dp[i][buy];
        if(buy == 1)
        {
            profit = Math.max((-arr[i] + f(i+1, 0, arr, n,dp)),(0 + f(i+1, 1, arr, n,dp)));
        }
        else{
            profit = Math.max(arr[i] + f(i+1, 1, arr, n,dp), 0 + f(i+1, 0, arr, n,dp));
        }
        return dp[i][buy] = profit;
    } */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
/*         int dp[][] = new int[n][2];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<2;j++)
            {
                dp[i][j] = -1;
            }
        } */
        //System.out.println(f(0,1,arr,n,dp));
        int prevb,prevnb,curb,curnb;
        prevb = prevnb = 0;
        for(int i=n-1;i>=0;i--)
        {
            curb = Math.max(-arr[i] + prevnb, 0 + prevb);
            curnb = Math.max(arr[i] + prevb, 0 + prevnb);

            prevnb = curnb;
            prevb = curb;
        }
        System.out.println(prevb);
    }   
}
