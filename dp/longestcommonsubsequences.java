package dp;

import java.util.Scanner;

import recursion.len;

public class longestcommonsubsequences {
    /* static int f(int ind1,int ind2,char arr1[],char arr2[],int dp[][])
    {
        if(ind1 > arr1.length - 1 || ind2 > arr2.length - 1) 
            return 0;
        if(dp[ind1][ind2]!=-1)
            return dp[ind1][ind2];
        if(arr1[ind1] == arr2[ind2])
            return dp[ind1][ind2] = 1 + f(ind1+1, ind2+1, arr1, arr2,dp);

        return dp[ind1][ind2] =  Math.max(f(ind1+1, ind2, arr1, arr2,dp),f(ind1, ind2+1, arr1, arr2,dp) );
    } */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        int n = arr1.length;
        int m = arr2.length;
        int dp[][] = new int[n+1][m+1];
        int prev[] = new int[m+1];
        int cur[] = new int[m+1];
        /* for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                dp[i][j] = -1;
            }
        }
        System.out.println(f(0,0,arr1,arr2,dp)); */
        for(int j=0;j<=m;j++){
            prev[j] = 0;
            cur[j] = 0;
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(arr1[i-1] == arr2[j-1])
                    cur[j] = 1 + prev[j-1];
                else
                    cur[j] = Math.max(prev[j],cur[j-1]);
            }
            prev = cur;
        }
        System.out.println(prev[m]);
        
    }  
}
