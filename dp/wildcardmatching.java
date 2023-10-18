package dp;

import java.util.Scanner;

public class wildcardmatching {
    /* static boolean f(int ind1,int ind2,char arr1[],char arr2[],int n,int m,int dp[][])
    {
        boolean ans;
        if(ind1 > n-1 && ind2 > m-1)
            return true;
        if(ind1 > n-1 && ind2 <= m-1)
            return false;
        if(ind2 > m-1 && ind1 <= n-1)
        {
            for(int i=ind1;i<n;i++)
            {
                if(arr1[i] != '*')
                    return false;
            }
            return true;
        }
        if(dp[ind1][ind2] !=-1)
        {
            if(dp[ind1][ind2]==1)
                return true;
            else    return false;
        }
        if(arr1[ind1] == arr2[ind2] || arr1[ind1] == '?'){
            ans = f(ind1+1, ind2+1, arr1, arr2, n, m,dp);
            if(ans)
            {
                dp[ind1][ind2] = 1;
            }
            else
                dp[ind1][ind2] = 0;
            return ans;}
        else if(arr1[ind1] == '*'){
            boolean ch1 = f(ind1+1, ind2, arr1, arr2, n, m,dp);
            boolean ch2 = f(ind1, ind2+1, arr1, arr2, n, m,dp);
            ans = ch1 | ch2;
            if(ans==true)
                dp[ind1][ind2] = 1;
            else
            dp[ind1][ind2] = 0;
            return ans; 
        }
        return false;
    } */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.nextLine();
        char arr1[] = str.toCharArray();
        char arr2[] = str1.toCharArray();
        int n = arr1.length;
        int m = arr2.length;
        /* int dp[][] = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                dp[i][j] = -1;
            }
        }
        System.out.println(f(0,0,arr1,arr2,n,m,dp)); */
        boolean dp[][] = new boolean[n+1][m+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=m;j++){
                dp[i][j] = false;
            }
        }
        dp[0][0] = true;
        for(int j=1;j<=m;j++)
        {
            dp[0][j] = false;
        }
        for(int i=1;i<=n;i++)
        {
            boolean flag = true;
            for(int ii=1;ii<=i;ii++)
            {
                if(arr1[ii-1]!='*')
                {
                    flag = false;
                    break;
                }
            }
            dp[i][0] = flag;
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(arr1[i-1] == arr2[j-1] || arr1[i-1] == '?')
                {
                    dp[i][j] = dp[i-1][j-1];
                }
                else if(arr1[i-1] == '*')
                {
                    dp[i][j] = dp[i-1][j] | dp[i][j-1];
                }
                else
                    dp[i][j] = false;
            }
        }
        System.out.println(dp[n][m]);

    }   
}
