package dp;
import java.util.*;
public class longestbitonicsubsequence {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int dp[] = new int[n];
        int dp1[] = new int[n];
        for(int i=0;i<n;i++)
        {
            dp[i] = 1;
            dp1[i] = 1;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[j] < arr[i] && 1 + dp[j] > dp[i]){
                    dp[i] = 1 + dp[j];
                }
            }
        }
        int max = 1;
        for(int i=n-1;i>=0;i--)
        {
            for(int j=n-1;j>i;j--)
            {
                if(arr[j] < arr[i] && 1 + dp1[j] > dp1[i]){
                    dp1[i] = 1 + dp1[j];
                }
            }
            if((dp[i] + dp1[i])-1 > max)
            {
                max = (dp[i] + dp1[i])-1;
            }
        }
        System.out.println(max);
    }  
}
