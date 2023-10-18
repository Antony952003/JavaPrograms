import java.util.*;
public class maxi1safterflip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int i = 0;
        int j = 0;
        int flip = 0;
        int ans = 0;
        while(i < n){
            
            if(arr[i] == 0){
                flip++;
            }
            while(flip > m){
                if(arr[j] == 0)
                    flip--;
                j++;
            }
            ans = Math.max(ans,i-j+1);
            System.out.println(ans+" at "+i+" element");
            i++;
        }
        System.out.println(ans);
    }
}
