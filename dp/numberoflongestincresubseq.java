package dp;

import java.util.Arrays;
import java.util.Scanner;

public class numberoflongestincresubseq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int dp[] = new int[n];
        Arrays.fill(dp, 1);
        int cnt[] = new int[n];
        Arrays.fill(cnt, 1);
        int max = 1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[i] > arr[j] && dp[j] + 1 > dp[i])
                {
                    dp[i] = 1 + dp[j];
                    cnt[i] = cnt[j];
                }
                else if(dp[j] + 1 == dp[i])
                {
                    cnt[i] += cnt[j];
                }
            }
            max = Math.max(max,dp[i]);
        }
        System.out.println(max);
        int val = 0;
        for(int i=0;i<n;i++)
        {
            System.out.print(dp[i]+" ");
            if(dp[i] == max)
            {
                val += cnt[i];
            }
        }
        System.out.println(val);
    }   
}
