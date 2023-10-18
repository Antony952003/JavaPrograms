import java.util.*;
import java.io.*;
public class mergesorta {

    public static void mergesort(int array[]){
        int arrsize = array.length;
        if(arrsize < 2)
        {
            return;
        }
        int mid = arrsize/2;
        int left[] = new int[mid];
        int right[] = new int[arrsize - mid];

        for(int i=0;i<mid;i++)
        {
            left[i] = array[i];
        }
        for(int i=mid;i<arrsize;i++)
        {
            right[i - mid] = array[i];
        }

        mergesort(left);
        mergesort(right);

        conquer(array, left, right);
    }

    public static void conquer(int arr[],int left[],int right[])
    {
        int arrsize = arr.length;
        int leftsize = left.length;
        int rightsize = right.length;
        int i=0,j=0,k=0;
        while(i < leftsize && j < rightsize)
        {
            if(left[i] <= right[j])
            {
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < leftsize)
        {
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j < rightsize)
        {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements one by one :");
        for(int i=0;i<n;i++){
            
            arr[i]=sc.nextInt();
        }
        mergesort(arr);
        System.out.println("SORTED ELEMENTS :");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    
}
