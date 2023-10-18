import java.util.*;
public class Asciiconcept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
    int hash[] = new int[n+1];
    for(int i=0;i<n;i++){
        hash[arr[i]] += 1;
    }
    int ans[] = new int[k];
    for(int i=0;i<k;i++){
        int max = 0;
        int in = 0;
        for(int j=hash.length-1;j>=0;j--){
            if(hash[j] > max){
                max = hash[j];
                in = j;
            }
        }
        System.out.print(in+" : "+max);
        ans[i] = in;
        hash[in] = 0;
    }
    System.out.println();
    for(int i=0;i<k;i++){
        System.out.print(ans[i]+" ");
    }
    }
}
