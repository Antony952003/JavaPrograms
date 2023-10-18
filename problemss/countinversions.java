import java.util.*;
public class countinversions {
    static int mergesort(int arr[],int low,int high){
        int cnt = 0;
        if(low >= high) return cnt;
        int mid = (low + high) / 2;
        cnt += mergesort(arr, low, mid);
        cnt += mergesort(arr, mid+1, high);
        cnt += merge(arr,low,mid,high);
        return cnt;
    }

    static int merge(int[] arr,int low,int mid,int high){
        int cnt = 0;
        int temp[] = new int[high - low + 1];
        int left=low,right=mid+1,k=0;
        while((left <= mid) && (right <= high)){
            if(arr[left] <= arr[right]){
                temp[k] = arr[left];
                left++;
             }
             else{
                temp[k] = arr[right];
                if(arr[left] > 2*arr[right])
                    cnt += (mid - left + 1);
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
        return cnt;  
    }
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        } 
        int ans = mergesort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(ans);
    }
}
