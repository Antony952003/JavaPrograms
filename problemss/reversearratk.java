import java.util.Scanner;

public class reversearratk {
    static void reverse(int arr[],int f,int l){
        while(f<l){
            int temp = arr[f];
            arr[f] = arr[l];
            arr[l] = temp;
            f++;
            l--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int i = 0;
        while(i < n){
            int start = i;
            int cnt = 0;
            while(cnt < k && (i<n)){
                i++;
                cnt++;
            }
            int last = i - 1;
            reverse(arr,start,last);
        }
        for(int x=0;x<n;x++){
            System.out.print(arr[x]+" ");
        }
    }
}
