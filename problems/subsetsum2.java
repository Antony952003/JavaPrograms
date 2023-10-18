package problems;
import java.util.*;
public class subsetsum2 {
    public static void f(int index,int arr[],ArrayList<Integer> ar,int n)
    {
        System.out.println(ar);
        
        for(int i=index;i<n;i++)
        {
            if(i > index && arr[i] == arr[i-1])
                continue;
            ar.add(arr[i]);
            f(i+1, arr, ar, n);
            ar.remove(ar.get(ar.size()-1));
        }
        return;


    }
    public static void fun(int i,int n)
    {
        if(i<1)
            return;
        else{
            System.out.println(i);
            fun(i-1, n);
        }


    }
    public static void main(String[] args) {
        int arr[] = {1,2,2};
        int n = arr.length;
        ArrayList<Integer> ar =new ArrayList<>();
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        f(0,arr,ar,n);
        fun(5,5);
    }
}
