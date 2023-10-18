package problems;
import java.util.ArrayList;
import java.util.Arrays;

public class combinationsum2 {
    public static void f(int index,int target,int arr[],ArrayList<Integer> ar)
    {
        if(target == 0)
        {
            System.out.println(ar);
            return;
        }
        
    for(int i=index;i<arr.length;i++)
    {
        if(i > index && arr[i] == arr[i-1])
            continue;
        if(arr[i] > target)
            break;
        ar.add(arr[i]);
        f(i+1, target - arr[i], arr, ar);
        ar.remove(ar.size()-1);    
    }
}
    public static void main(String[] args) {
        int arr[] = {3,5,6,7};
        int n = arr.length;
        int target = 9;
        Arrays.sort(arr);
        ArrayList<Integer> ar = new ArrayList<>();
        f(0,target,arr,ar);
        System.out.println();
        
    }   
}

