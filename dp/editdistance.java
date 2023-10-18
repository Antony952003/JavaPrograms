package dp;

import java.util.Arrays;
import java.util.Scanner;

public class editdistance {
    /* static int f(int i,int j,char arr1[],char arr2[],int n,int m,int dp[][])
    {
        if(j < 0)
            return i+1; // when str2 is a empty string str1 requires (i+1) deletions to make it to str2
        if(i < 0)   
            return j+1; // when str1 is a empty string
        if(dp[i][j] !=-1)
            return dp[i][j];
        if(arr1[i] == arr2[j])
            return dp[i][j] = f(i-1, j-1, arr1, arr2, n, m,dp);
        else{
            int insert = 1 + f(i, j-1, arr1, arr2, n, m,dp);
            int delete = 1 + f(i-1, j, arr1, arr2, n, m,dp);
            int replace = 1 + f(i-1, j-1, arr1, arr2, n, m,dp);
            return dp[i][j] =  Math.min(replace, Math.min(insert, delete));
        }
    } */
    public static void main(String[] args) {
        //the problem is about to coonvert a str1 to str2 using min operartions(insert,delete,replace)
        Scanner sc= new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        int n = arr1.length;
        int m = arr2.length;
        /* int dp[][] = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                dp[i][j] = -1;
            }
        } */
        //System.out.println(f(n-1,m-1,arr1,arr2,n,m,dp));
        int dp[][] = new int[n+1][m+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=m;j++)
            {
                dp[i][j] = 0;
            }
        }
        for(int i=0;i<=n;i++)
        {
            dp[i][0] = i;
        }
        for(int j=0;j<=m;j++)
        {
            dp[0][j] = j;
        }
        for(int i=1;i<=n;i++)
        {  
            for(int j=1;j<=m;j++)
            {
                if(arr1[i-1]==arr2[j-1])
                    dp[i][j] = dp[i-1][j-1];
                else{
                    int insert = 1 + dp[i][j-1];
                    int delete = 1 + dp[i-1][j];
                    int replace = 1 + dp[i-1][j-1];
                    dp[i][j] = Math.min(replace, Math.min(insert, delete));
                }
            }
        }
        System.out.println(dp[n][m]);
    }
}
