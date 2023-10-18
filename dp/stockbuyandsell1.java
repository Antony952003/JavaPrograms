package dp;

import java.util.Scanner;

public class stockbuyandsell1 {
    static int bin(int st,int en,int arr[],int search)
    {
        if(st>en)
            return -1;
        int mid = st+en/2;
        while(st<=en)
        {
            if(search == arr[mid])
            {
                return mid;
            }
            else if(search < arr[mid])
            {
                en = mid-1;
            }
            else if(search > arr[mid])
            {
                st=mid+1;
            }
            mid = (st+en)/2;
        }
        return -1;
    }
    //stock buy and sell part 1 is about to buy and sell stocks only once and get the max profit
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] =sc.nextInt();
        }
        int search = sc.nextInt();
        System.out.println("Ans is "+bin(0, n-1, arr, search));
        /* int profit = 0;
        int min = arr[0]; 
        for(int i=1;i<n;i++)
        {
            profit = Math.max(profit, arr[i] - min);
            min = Math.min(min, arr[i]);
        }
        System.out.println(profit); */

        

    }
}
