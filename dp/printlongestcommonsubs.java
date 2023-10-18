package dp;

import java.util.Scanner;

public class printlongestcommonsubs {
    /* static String f(int ind1,int ind2,char arr1[],char arr2[],String dp[][])
    {
        if(ind1 > arr1.length-1 || ind2 > arr2.length - 1)
            return "";
        if(dp[ind1][ind2] != "-")
            return dp[ind1][ind2];
        if(arr1[ind1] == arr2[ind2])
            return dp[ind1][ind2] =  arr1[ind1] + f(ind1+1, ind2+1, arr1, arr2,dp);
        String a =  f(ind1+1, ind2, arr1, arr2,dp);
        String b =  f(ind1,ind2+1,arr1,arr2,dp);
        if(a.length()>b.length())
            return dp[ind1][ind2] = a;
        else
            return dp[ind1][ind2] = b;
    } */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        int n = arr1.length;
        int m = arr2.length;
        String dp[][] = new String[n+1][m+1];
        /* for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                dp[i][j] = "-";
            }
        }
        System.out.println(f(0,0,arr1,arr2,dp)); */
        for(int i=0;i<=n;i++)
            dp[i][0] = "";
        for(int j=0;j<=m;j++)
            dp[0][j] = "";
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(arr1[i-1] == arr2[j-1])
                    dp[i][j] = arr1[i-1] + dp[i-1][j-1];
                else
                    {
                        if((dp[i-1][j]).length() > (dp[i][j-1]).length())
                            dp[i][j] = dp[i-1][j];
                        else
                            dp[i][j] = dp[i][j-1];
                    }
            }
        }
        //System.out.println(dp[n][m]);
        String s="";
        for(int i=dp[n][m].length()-1;i>=0;i--)
            s+=dp[n][m].charAt(i);
        System.out.println(s);
    }
}
