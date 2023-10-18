import java.util.*;

public class printsubseq {
    static int f(int i,int sum,int arr[],ArrayList<ArrayList<Integer>> res,ArrayList<Integer> ar,int gsum){
        if(i >= arr.length){
            if(sum == gsum)
                return 1;
            return 0;
        }
        ar.add(arr[i]);
        sum += arr[i];
        int take = f(i+1,sum,arr,res,ar,gsum);
        ar.remove(ar.size()-1);
        sum -= arr[i];
        int nottake = f(i+1,sum,arr,res,ar,gsum);
        return take + nottake;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int gsum = sc.nextInt();
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> ar = new ArrayList<Integer>();
        int sum = 0;
        System.out.println(f(0,sum,arr,res,ar,gsum));
    }
}
