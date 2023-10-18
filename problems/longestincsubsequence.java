package problems;
import java.util.*;
public class longestincsubsequence {
    public static int fun(int index,int prev,int arr[],int n)
    {
        if(index==n)
        {
            return 0;
        }

        int len = fun(index+1, prev, arr, n);
        if(prev == -1 || arr[index] > arr[prev])
        {
            len = Math.max(len , 1 + fun(index+1, index, arr, n));
        }
        return len;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(fun(0,-1,arr,n));
        
    }
}
