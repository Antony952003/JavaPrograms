package dp;

import java.util.Arrays;
import java.util.Scanner;

public class distinctsubsequences {
    /* static int f(int ind1,int ind2,char arr1[],char arr2[],int n,int m,int dp[][])
    {
        if(ind2 > m-1)
        return 1;
        if(ind1 > n-1)
            return 0;
        if(dp[ind1][ind2] !=-1)
            return dp[ind1][ind2];
        if(arr1[ind1] == arr2[ind2])
            return dp[ind1][ind2] =  f(ind1+1, ind2+1, arr1, arr2, n, m,dp) + f(ind1+1, ind2, arr1, arr2, n, m,dp);
        return dp[ind1][ind2] = f(ind1+1, ind2, arr1, arr2, n, m,dp);
    } */
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2  = sc.nextLine();
    int n = str1.length();
    int m = str2.length();
    char arr1[] = str1.toCharArray();
    char arr2[] = str2.toCharArray();
    int prev[] = new int[m+1];
    for(int j=1;j<=m;j++)
    {
        prev[j] = 0;
    }

    prev[0] = 1;
    for(int i=1;i<=n;i++)
    {
        for(int j=m;j>=1;j--)
        {
            if(arr1[i-1]==arr2[j-1]){
                prev[j] = prev[j-1] + prev[j];
            }
        }
    }
    System.out.println(prev[m]);

   }
}
