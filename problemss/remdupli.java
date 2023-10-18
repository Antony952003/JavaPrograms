import java.util.*;;

public class remdupli {
    static int remove_duplicate(int arr[],int n){
        int i = 0;
        int j = 1;
        int last = i;
        while(i < n){
        while(j<n && arr[i] == arr[j]){
            j++;
        }
        i++;
        if(i<n && j < n){
            System.out.println(arr[i]+" <- arr[i] and this one is arr[j] -> "+arr[j]);
            last = i;
            arr[i] = arr[j];
        }
        }
        return last+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int ans = remove_duplicate(arr,n);
        System.out.println(ans);
    }   
}
