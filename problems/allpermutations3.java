package problems;
import java.util.*;
public class allpermutations3 {
    public static ArrayList<ArrayList<Integer>> f(int index,int arr[],ArrayList<ArrayList<Integer>> ds)
    {
        if(index==arr.length)
        {
            ArrayList<Integer> ar = new ArrayList<>();
            for(int i=0;i<arr.length;i++)
            {
                ar.add(arr[i]);
            } 
            ds.add(new ArrayList<>(ar));
            return ds;
        }
        for(int i=index;i<arr.length;i++)
        {
            swap(i,index,arr);
            f(index+1,arr,ds);
            swap(i,index,arr);
        }
        return ds;
    }
    public static void swap(int a,int b,int []arr)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        ArrayList<ArrayList<Integer>> ds = new ArrayList<>();
        System.out.println(f(0,arr,ds));
        
    }
}
