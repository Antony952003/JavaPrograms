package dp;

import java.util.Scanner;

public class mininsertionstomakepalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = "";
        char arr1[] = str1.toCharArray();
        for(int i=str1.length()-1;i>=0;i--)
        {
            str2+=arr1[i];
        }
        int n = arr1.length;
        char arr2[] = str2.toCharArray();
        int m = arr2.length;
        int dp[][] = new int[n+1][m+1];
        for(int i=0;i<=n;i++)
            dp[i][0] = 0;
        for(int j=0;j<=m;j++)
            dp[0][j] = 0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(arr1[i-1]==arr2[j-1])
                    dp[i][j] = 1 + dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        System.out.println(n-dp[n][m]);
    }
}
