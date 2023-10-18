package dp;

import java.util.Scanner;

public class mazeblockage {
    //dp recursive method
/*     static boolean issafe(int row,int col,int arr[][])
    {

        if(row < 0||col <0)
        {
            return false;
        }
        if(arr[row][col] == -1)
        {
            return false;
        }
        return true;
    }
    static int f(int row,int col,int arr[][],int dp[][])
    {
        if(row==0 && col==0)
        {
            return 1;
        }
        if(dp[row][col] != -1)
            return dp[row][col];
        int up = 0,left =0;
        if(issafe(row-1, col, arr))
            up = f(row-1,col,arr,dp);
        if(issafe(row, col-1, arr))   
            left = f(row,col-1,arr,dp);
        return dp[row][col] = up + left;
    } */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][]= new int[n][n];
        int dp[][]= new int[n][n];
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
//        System.out.println(f(n-1,n-1,arr,dp));
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int up = 0;
                int left = 0;
                if(i==0 && j==0)
                    dp[i][j] =1;
                else{
                    if(i>0 && arr[i-1][j]!=-1)
                        up = dp[i-1][j];
                    if(j>0 && arr[i][j-1]!=-1)
                        left = dp[i][j-1];
                        dp[i][j] = left + up;
                }
            }
        }
        System.out.println(dp[n-1][n-1]);

    }
}
