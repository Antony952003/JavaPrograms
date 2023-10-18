package dp;

import java.util.Scanner;

public class houserobber {
    static int f(int arr[],int n)
    {
        int prev2 = 0;
        int prev = arr[0];
        for(int i=1;i<n;i++)
        {
            int take = arr[i];
            if(i>1)
                take += prev2;
            int nottake = prev;
            int curri = Math.max(take, nottake);
            prev2 = prev;
            prev = curri;
        }
        return prev; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] =sc.nextInt();
        }
        int ar1[] = new int[n-1];
        int ar2[] = new int[n-1];
        int k = 0;
        int k1 = 0;
        for(int i=0;i<n;i++)
        {
            if(i!=0){
                ar1[k] = arr[i];
            k++;
        }
            if(i!=n-1){
                ar2[k1] = arr[i];
                k1++;
            }
        }
       System.out.println( Math.max(f(ar1,ar1.length), f(ar2,ar2.length)));
         

    }
}
