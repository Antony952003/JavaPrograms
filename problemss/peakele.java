import java.util.*;
public class peakele {
    public static int peak(int arr[],int n){ 
        if(n >= 2 && arr[0] > arr[1]) return arr[0];
        if(n >= 2 && arr[n-1] > arr[n-2]) return arr[n-1];
        System.out.println("croseed");
        for(int i=1;i<n-1;i++){
            if(arr[i] >= arr[i+1] && arr[i] >= arr[i-1]){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        System.out.println(peak(arr,n)); 
    }
}
