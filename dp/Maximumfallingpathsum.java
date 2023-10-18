package dp;

import java.util.Scanner;

public class Maximumfallingpathsum {
    //dp recursive method
   /*   static int f(int row,int col,int arr[][],int dp[][],int n,int m)
    {
        if(row==n-1)
           return arr[row][col];
        if(dp[row][col] != -1)
            return dp[row][col];
        int down = arr[row][col] + f(row+1, col, arr,dp, n,m);
        int leftdiag = arr[row][col];
        if(col>0)
            leftdiag += f(row+1, col-1, arr,dp, n,m);
        int rightdiag = arr[row][col];
        if(col<m-1)
            rightdiag += f(row+1, col+1, arr,dp, n,m);
        int maxi = Math.max(leftdiag, rightdiag);
        return dp[row][col] =  Math.max(down, maxi);
    }  */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
      /*   1 2 10 4
        100 3 2 1
        1 1 20 2
        1 2 2 1 
        3 3
        10 2 3
        3 7 2
        8 1 5*/
         int dp[] = new int[m];
         /*for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                dp[i][j] = -1;
            }
        }
        int max = 0;
        for(int i=0;i<m;i++)
        {
            max = Math.max(max, f(0,i,arr,dp,n,m));
        }
        System.out.println(max);  */
        
        
        //for loop without space optimization
        /*  for(int i=0;i<m;i++)
        {
            dp[n-1][i] = arr[n-1][i];
        }
        for(int i=n-2;i>=0;i--)
        {
            for(int j=0;j<m;j++)
            {
                int down = arr[i][j] + dp[i+1][j];
        int leftdiag = arr[i][j];
        if(j>0)
            leftdiag += dp[i+1][j-1];
        int rightdiag = arr[i][j];
        if(j<m-1)
            rightdiag += dp[i+1][j+1];
        int maxi = Math.max(leftdiag, rightdiag);
            dp[i][j] =  Math.max(down, maxi);
            }
        }
        int max = 0;
        for(int j=0;j<m;j++)
        {
            max = Math.max(max, dp[0][j]);
        }
        System.out.println(max);  */


        //for loop with space optimaization
        for(int i=0;i<m;i++)
        {
            dp[i] = arr[n-1][i];
        }
        for(int i=n-2;i>=0;i--)
        {
            int curr[] = new int[n];
            for(int j=0;j<m;j++)
            {
                int down = arr[i][j] + dp[j];
        int leftdiag = arr[i][j];
        if(j>0)
            leftdiag += dp[j-1];
        int rightdiag = arr[i][j];
        if(j<m-1)
            rightdiag += dp[j+1];
        int maxi = Math.max(leftdiag, rightdiag);
            curr[j] =  Math.max(down, maxi);
            }
            dp = curr;
        }
        int max = 0;
        for(int j=0;j<m;j++)
        {
            max = Math.max(max, dp[j]);
        }
        System.out.println(max);
        
    }
}
