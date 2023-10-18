import java.util.*;
public class reversearrusingrec {
    static int[] f(int i, int j,int arr[]) {
        if(i>j){
            return arr;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return f(++i,--j,arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        int res[] = f(0,n-1,arr);
        for(int i=0;i<n;i++){
            System.out.print(res[i] +" ");
        }

    }
}
