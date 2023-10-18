import java.util.*;
public class sort012 {
    static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int low = 0;
        int mid = 0;
        int high = n-1;
        while(mid <= high){
            if(arr[mid] == 0){
                System.out.println(low +" low && mid value at 0 "+mid);
                swap(arr,low,mid);
                low++;
                mid++;
            }
            else if(arr[mid] == 2){
                swap(arr,mid,high);
                high--;
            }
            else if(arr[mid] == 1)    mid++;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    } 
}
