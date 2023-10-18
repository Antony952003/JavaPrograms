package problems;

import java.util.Scanner;

public class containerwithmost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int i = 0;
        int j = n-1;
        int maxsofar = 0;
        while(i < j)
        {
            if(arr[i] < arr[j])
            {
                maxsofar = Math.max(maxsofar,arr[i]*(j-i));
                i++;
            }
            else{
                maxsofar = Math.max(maxsofar,arr[j]*(j-i));
                j--;
            }
        }
        System.out.println(maxsofar);
    }
}
