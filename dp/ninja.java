package dp;

import java.util.Arrays;
import java.util.Scanner;

public class ninja {
    static int f(int index,int last,int arr[][],int dp[][])
    {
        if(index==0)
        {
            int max = 0;
            for(int i=0;i<arr[0].length;i++)
            {
                if(i!=last)
                {
                    max = Math.max(max, arr[0][i]);
                }
            }
            return max;
        }
        if(dp[index][last] != -1)
        {
            return dp[index][last];
        }
        int max = 0;
        for(int i=0;i<arr[0].length;i++)
        {
            if(i!=last)
            {
            int points = arr[index][i] + f(index-1, i, arr,dp);
            max = Math.max(max, points);
            }
        }
        return dp[index][last] = max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        int dp[][] = new int[r][(c+1)];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<(c+1);j++)
            {
                dp[i][j] = -1;
            }
        }
        System.out.println(f(r-1,3,arr,dp));
    }
}
