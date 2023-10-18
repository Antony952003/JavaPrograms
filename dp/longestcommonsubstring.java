package dp;

import java.util.Scanner;

public class longestcommonsubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        int n = arr1.length;
        int m = arr2.length;
        int dp[][] = new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            dp[i][0] = 0;
        }
        for(int i=0;i<=m;i++)
        {
            dp[0][i] = 0;
        }
        int max = 0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {   
                if(arr1[i-1] == arr2[j-1]){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else
                    dp[i][j] = 0;
            }
        }
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                max = Math.max(max, dp[i][j]);
            }
        }
        System.out.println(max);

    }
}
/* forgeeksskeegfor */