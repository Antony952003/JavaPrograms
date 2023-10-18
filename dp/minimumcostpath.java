package dp;

import java.util.Scanner;

public class minimumcostpath {
    //dp recursive soln
    /* static int f(int row,int col, int arr[][],int dp[][])
    {
        if(row==0 && col==0)
            return arr[row][col];
        if(row<0 || col<0)
         return 999999;
        int left = 0;
        int up = 0;
        if(dp[row][col]!=-1)
            return dp[row][col];
        up = arr[row][col] + f(row-1,col,arr,dp);
        left = arr[row][col] + f(row,col-1,arr,dp);
        return dp[row][col] = Math.min(left, up);
    } */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int arr[][] = new int[n][n];
        int dp[][] = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                dp[i][j] = -1;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 && j==0)
                {
                    dp[i][j] = arr[i][j];
                }
                else{
                    int down = 0;
                    int right = 0;
                    down = arr[i][j];
                    if(i>0)
                        down += dp[i-1][j];
                    else
                        down += 999999;
                    right =arr[i][j];
                    if(j>0)
                        right += dp[i][j-1];
                    else
                        right += 999999;
                    dp[i][j] = Math.min(down , right);
                }
            }
        }
        System.out.println(dp[n-1][n-1]); 
        //System.out.println(f(n-1,n-1,arr,dp));
    }
}
