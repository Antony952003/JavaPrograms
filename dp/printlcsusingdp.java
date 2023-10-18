package dp;

import java.util.Scanner;

public class printlcsusingdp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();
    char arr1[] = str1.toCharArray();
    char arr2[] = str2.toCharArray();
    int n = arr1.length;
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
            if(arr1[i-1] == arr2[j-1])
                dp[i][j] = 1 + dp[i-1][j-1];
            else
                dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
        }
    }
    char ans[] = new char[dp[n][m]];
    int len = ans.length-1;
    int i=n;int j=m;
    while(i > 0 && j > 0)
    {
        if(arr1[i-1]==arr2[j-1]){
            ans[len] = arr1[i-1];
            len--;
            i--;
            j--;
    }
    else if(dp[i-1][j] > dp[i][j-1]){
        i--;
    }
    else
        j--;
    }
    System.out.println(ans);
    
 }
}
