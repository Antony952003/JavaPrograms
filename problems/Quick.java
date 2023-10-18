package problems;
import java.util.*;
public class Quick{
    public static void quicksort(int arr[],int low, int high)
    {
        int pivot,i,j,temp;
        pivot = arr[low];
        i = low;
        j = high;
        while(i<j)
        {
   
            while(arr[i]<pivot && i<=high)
            {
                i++;
            }
            while(arr[j]>pivot && j>=low)
            {
                j--;
            }

            if(i<j)
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        if(i>j)
        {
        temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;
        }
        if(j<high)
        {
        quicksort(arr,low, j-1);
        quicksort(arr,j+1, high);
        }
        
    }
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the no of elements :");
        int a = sc.nextInt();
        int array[] =  new int[a+1];
        System.out.println("Enter the element one by one :");
        for(int i=0;i<a;i++)
        {
            array[i] = sc.nextInt();
        }
        array[a] = 99999;
        quicksort(array,0,a-1);
        System.out.println();
        for(int i=0;i<a;i++)
        {
            System.out.print(array[i]);
        }

        }
    }
