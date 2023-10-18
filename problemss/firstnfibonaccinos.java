import java.util.*;
public class firstnfibonaccinos {
    static long f(int n,long arr[]){
        if(n == 1 || n == 0) {
            return arr[n] = 1;
        }
        long ans = arr[n] = f(n-1,arr) + f(n-2,arr);
        return ans;
    }
    public static void main(String[] args) {
        int n = 5;
        long arr[] = new long[n];
        long ans = f(n-1,arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }   
}
