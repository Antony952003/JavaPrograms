import java.util.*;
public class mostoccur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int i = 0;
        int j = 1;
        int max = -9999;
        int val  = arr[0];
        while(i < n){
            int sum = 1;
            while(j<n && arr[i] == arr[j]){
                j++;
                sum++;
            }
            if(sum > max){
                max = sum;
                val = arr[i];
            }
            i = j;
        }
        System.out.println(val+" - "+max);
        }
    }
    
