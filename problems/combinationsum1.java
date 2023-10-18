package problems;
import java.util.*;
public class combinationsum1 {
    public static int f(int index,int arr[],int target,ArrayList<Integer> ar,ArrayList<ArrayList<Integer>> ar1)
    {
        int count = 0;
        if(index == arr.length)
        {
            if(target == 0){
                if(!(ar1.contains(ar)))
                    ar1.add(new ArrayList<>(ar));
                return 1;
            }
            else{
                return 0;
            }
        }
        if(arr[index] <= target)
        {
        ar.add(arr[index]);
        count += f(index,arr,target - arr[index],ar,ar1);
        ar.remove(ar.get(ar.size()-1));
        }
        count += f(index+1,arr,target,ar,ar1);
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 6;
        int arr[] = {10,5,20,30};

        int target = 20;
        ArrayList<Integer> ar = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ar1 = new ArrayList<>();
        System.out.println(f(0,arr,target,ar,ar1));
        System.out.println(ar1);
    }
}
