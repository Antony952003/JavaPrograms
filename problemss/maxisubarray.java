import java.util.*;
public class maxisubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        int maxsub = Integer.MIN_VALUE;
        int sub = 0;
        int start = -1;
        int ansstart = -1,ansend = -1;
        for(int i=0;i<n;i++){
            if(sub  == 0) start = i;  
            sub = Math.max(sub+arr[i],arr[i]);
            if(sub > maxsub){
                maxsub = sub;
                ansstart = start;
                ansend = i; 
            }
            if(sub < 0) sub = 0;
            ArrayList<Integer> pos = new ArrayList<>();
        }
        System.out.println("The maximum subarray = " + maxsub);
        for(int i=ansstart;i<=ansend;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
