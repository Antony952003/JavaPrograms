import java.util.*;


public class minnojumps {
    static int f(int index,int arr[]){
        if(index >= arr.length-1) return 1;
        int min = 99999;
        for(int i=1;i<=arr[index];i++){
            min = Math.min(min,1+f(index+i, arr));
        } 
        return min;
    }
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int res = f(0,arr);
        System.out.println(res);
    }
}
