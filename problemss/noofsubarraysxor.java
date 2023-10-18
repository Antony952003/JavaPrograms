import java.util.*;
public class noofsubarraysxor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        int k = sc.nextInt();
        int cnt = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int pxor = 0;
        for(int i=0;i<n;i++){
            pxor ^= arr[i];

            if(map.containsKey(pxor ^ k)){
                cnt += map.get(pxor ^ k);
            }

            if(!map.containsKey(pxor)){
                map.put(pxor,1);
            }
            else{
                map.put(pxor,map.get(pxor)+1);
            }
        }
        System.out.println(cnt);

    }
}
