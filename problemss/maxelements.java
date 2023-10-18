import java.util.*;
public class maxelements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        System.out.print(arr[0]+" ");
        int cnt = 1;
        for(int i=1;i<n;i++){
            if(arr[i] > max){
                System.out.print(arr[i]+" ");
                cnt++;
                max = arr[i];
            }
        }
        System.out.println();
        System.out.println(cnt);
    }
}

// 7 4 8 2 9