package problems;
import java.util.*;
public class binarysort {
    public static void sort(int arr[])
    {
        int arrsize = arr.length;
        for(int i = 0;i<arrsize;i++)
        {
           for(int j=0;j<arrsize;j++)
           {
            if(arr[j]>arr[i])
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
           } 
        }
        System.out.println();
        for(int i=0;i<arrsize;i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
        int a = sc.nextInt();
        int arr1[] = new int[a];
        for(int i=0;i<a;i++)
        {
            arr1[i] = sc.nextInt();
        }
        sort(arr1);

        t--;
    }
        
        

    }
}
