package dp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class printlongestincrsubse {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int dp[] = new int[n];
        for(int i=0;i<n;i++)
        {
            dp[i] = 1;
        }
        int hash[] = new int[n];
        int max = 1;
        int last = 0;
        for(int i=0;i<n;i++)
        {
            hash[i] = i;
            for(int j=0;j<i;j++)
            {
                if(arr[j] < arr[i] && 1 + dp[j] > dp[i]){
                    dp[i] = 1 + dp[j];
                    hash[i] = j;
                }
                
                if(dp[i] > max)
                {
                    max = dp[i];
                    last = i;
                }
            }
        }
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(arr[last]);
        while(hash[last] != last)
        {
            last = hash[last];
            ar.add(arr[last]);
        }
        Collections.reverse(ar);
        System.out.println(ar);
        
    }
}
