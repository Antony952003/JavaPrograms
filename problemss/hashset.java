import java.util.*;

public class hashset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        int cnt = 1;
        int lon = -9999;
        int last = arr[0];
        for(int i=0;i<n;i++){
            if(set.contains(arr[i]-1) && (last == arr[i]-1)){
                cnt++;
                last = arr[i];
            }
            else if(!set.contains(arr[i]-1) || (last != arr[i]-1)){
                cnt = 1;
                last = arr[i];
            }
            lon = Math.max(lon,cnt);
        }
        System.out.println(lon);
    }
}
