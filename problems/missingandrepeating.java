package problems;

import java.util.Scanner;

public class missingandrepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int x = 0;
        for(int i=0;i<n;i++)
        {
            x = x ^ arr[i];
            x = x ^ (i+1);
        }
        System.out.println(x);
        int setbit = x & (~(x-1));
        int a = 0;
        int b = 0;
        for(int i=0;i<n;i++)
        {
            if((arr[i] & setbit) == setbit)
            {
                a = a ^ arr[i];
            }
            else{
                b = b ^ arr[i];
            }
        }
        for(int i=1;i<=n;i++)
        {
            if((i & setbit) == setbit)
            {
                a = a ^ i;
            }
            else{
                b = b ^ i;
            }
        }
        int miss = a;
        int repeat = b;
        for(int i=0;i<n;i++)
        {
            if(arr[i] == miss)
            {
                miss = b;
                repeat = a;
            }
        }
        System.out.println("missing value is "+miss+" and the repeating value is "+repeat);
    }
}
