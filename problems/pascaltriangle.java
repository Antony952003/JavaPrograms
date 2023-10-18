package problems;

import java.util.ArrayList;
import java.util.Scanner;

public class pascaltriangle {
    static int f(int i,int j,int dp[][])
    {
        if(i == 0 && j == 0)
        {
            return 1;
        }
        if(i < 0 || j < 0)
            return 0;
        if(dp[i][j] != -1)
            return dp[i][j];
        return dp[i][j] = f(i-1, j-1,dp) + f(i-1, j,dp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> row,pre = null;
        for(int i=0;i<n;i++)
        {
            row = new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                if(j == 0 || j == i)
                    row.add(1);
                else
                    row.add(pre.get(j-1) + pre.get(j));
            }
                pre = row;
                res.add(row);
        }

        int dp[][] = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                dp[i][j] = -1;
            }
        }
        System.out.println(f(4, 4,dp));
        System.out.println(res);
    }
}
