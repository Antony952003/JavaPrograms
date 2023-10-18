import java.util.*;
public class noofsubsetxor {
    static int find(int i,int xor,int arr[],int k,int n){
        if(i == n){
            if(xor == k)    return 1;
            else return 0;
        }

        int ans = 0;
        ans += find(i+1,xor^arr[i],arr,k,n);
        ans += find(i+1,xor,arr,k,n);

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int ans = find(0,0,arr,k,n);
        System.out.println(ans);
    }
}
