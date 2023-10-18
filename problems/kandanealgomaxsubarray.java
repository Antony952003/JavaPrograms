package problems;

import java.util.Scanner;

public class kandanealgomaxsubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int max = -999999;
        int take = 0;
        int nottake = 0;
        for(int i=0;i<n;i++)
        {
            take = sum + arr[i];
            nottake = arr[i];
            sum = Math.max(nottake, take);
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}
