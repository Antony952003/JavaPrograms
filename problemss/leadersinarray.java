import java.util.*;

public class leadersinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans[] = new int[n];
        ArrayList<Integer> ar = new ArrayList<>();
        int max = arr[n-1];
        ar.add(max);
        for(int i=n-1;i>=0;i--){
            if(arr[i] > max){
                ar.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(ar);
        System.out.println(ar);


    }
}
