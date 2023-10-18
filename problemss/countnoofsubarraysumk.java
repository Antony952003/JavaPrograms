import java.util.*;
public class countnoofsubarraysumk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        int cnt = 0;
        int psum = 0;
        map.put(0,1);
        for(int i=0;i<n;i++){
            psum += arr[i];
            if(map.containsKey(psum - k)){
                cnt += map.get(psum - k);
            }
            if(map.containsKey(psum)){
                map.put(psum,map.get(psum)+1);
            }
            else{
                map.put(psum,1);
            }
        }
        System.out.println(cnt);
    }
}
