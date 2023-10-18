package problems;
import java.util.*;
public class allpermutations2 {
    public static void f(int arr[],ArrayList<Integer> ar,int n,ArrayList<ArrayList<Integer>> ans)
    {
        if(ar.size()==n)
        {
            //System.out.println(ar);
            ans.add(new ArrayList<>(ar));
            return;
        }
        for(int i=0;i<n;i++)
        {
            if(!ar.contains(arr[i]))
            {
                ar.add(arr[i]);
                f(arr, ar, n,ans);
                ar.remove(ar.get(ar.size()-1));
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] ={1,2,5};
        int n = arr.length;
        int k = sc.nextInt();
        ArrayList<Integer> ar = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        f(arr,ar,n,ans);
        System.out.println();
        System.out.println(ans.get(k));
    }   
}
