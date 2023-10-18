import java.util.*;

public class appearsonce {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int N = sc.nextInt();
        int n = sc.nextInt();
        int A[] = new int[n];
        for(int i=0;i<n;i++){
            A[i]= sc.nextInt();
        }
        int arr[] = new int[N+1];
        for(int i=0;i<A.length;i++){
           arr[A[i]] += 1;
        }
        for(int i=1;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        for(int i=1;i<arr.length;i++){
           if(arr[i] == 1){
                System.out.println(i+" the value is "+arr[i]);
                break;
            }
       }
    }
}
