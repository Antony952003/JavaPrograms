import java.util.*;
public class mergesortrec {
    static void mergesort(int arr[],int low,int high){
        if(low >= high) return;
        int mid = (low + high)/2;
        mergesort(arr, low, mid);
        mergesort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }
    static void merge(int[] arr,int low,int mid,int high){
        int temp[] = new int[high - low + 1];
        int left=low,right=mid+1,k=0;
        while((left <= mid) && (right <= high)){
            if(arr[left] <= arr[right]){
                temp[k] = arr[left];
                left++;
             }
             else{
                temp[k] = arr[right];
                right++;
             }
             k++;
        }
        while(left <= mid){
            temp[k] = arr[left];
            left++;
            k++;
        }
        while(right <= high){
            temp[k] = arr[right];
            right++;
            k++;
        }
        for(int i=low;i<=high;i++){
            arr[i] = temp[i - low]; 
        }
        
    }

    public static void main([] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Math.log10(10)+1);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        mergesort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
