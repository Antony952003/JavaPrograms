import java.util.*;
public class longestsubarrsumk {
    public static void main(String[] args) {
        System.out.println(ss == sp);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        int k = sc.nextInt();
        int i = 0;
        int j = 0;
        int sum = 0;
        int maxlen = 0;
        while(i < n){
            sum += arr[i];
            while(sum > k){
                sum = sum - arr[j];
                j++;
            }
            if(sum == k){
                maxlen = Math.max(maxlen,i-j+1);
            }
            i++;
        }
        
        System.out.println(maxlen);
    }
}
