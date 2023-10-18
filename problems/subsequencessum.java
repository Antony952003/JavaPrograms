package problems;
import java.util.*;
public class subsequencessum {
    public static int gsum = 4;

    public static int f(int index,int arr[],int sum,ArrayList<Integer> ar)
    {
        int count  = 0;
        if(index >= arr.length)
        {
            if(sum==gsum)
            {
                System.out.println(ar);
                return 1;
            }
            return 0;
        }
        ar.add(arr[index]);
        sum += arr[index];
          count += f(index+1, arr, sum, ar);
        sum = sum - ar.get(ar.size()-1);
        ar.remove(ar.size()-1);
        count += f(index+1, arr, sum, ar);

        return count;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int arr[] = {1,1,1,2,2};
        ArrayList<Integer> ar = new ArrayList<>();
       int count =  f(0,arr,0,ar);
        System.out.println(count);

    }
}
