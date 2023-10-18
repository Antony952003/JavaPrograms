package dp;

import java.util.Scanner;

public class ninjaforloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][3];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j] = sc.nextInt();
            } 
        }
        int dp[][] = new int[n][4];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<4;j++)
            {
                dp[i][j] = -1;
            } 
        }
        dp[0][0] = Math.max(arr[0][1],arr[0][2]);
        dp[0][1] = Math.max(arr[0][0],arr[0][2]);
        dp[0][2] = Math.max(arr[0][1],arr[0][0]);
        int temp = Math.max(arr[0][1],arr[0][2]);
        dp[0][3] = Math.max(arr[0][0], temp);

        for(int day=1;day<n;day++)
        {
            for(int last=0;last<4;last++)
            {
                int max = 0;
                dp[day][last] = 0;
                for(int task=0;task<3;task++)
                {
                    if(task!=last)
                    {
                        int points = arr[day][task] + dp[day-1][task];
                        max = Math.max(max, points);
                    }
                }
                dp[day][last] = max;
            }
        }
        System.out.println(dp[n-1][3]);

    }
}
