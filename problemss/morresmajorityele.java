import java.util.*;
public class morresmajorityele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ele = arr[0];
        int cnt = 0;
        for(int i=0;i<n;i++){
            if(cnt == 0){
                ele = arr[i];
                cnt = 0;
            }
            if(arr[i] == ele)
                cnt++;
            else
                cnt--;
        }
        cnt = 0;
        for(int i=0;i<n;i++){
            if(ele == arr[i]){
                cnt++;
            }
        }
        if(cnt > (n/2)) System.out.println(ele);
    }
}
