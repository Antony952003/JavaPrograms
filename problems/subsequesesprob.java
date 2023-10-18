package problems;
//subset sum 1 and subsequence same program
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class subsequesesprob {
    public static void f(int index,int arr[],ArrayList<Integer> ar,int sum,ArrayList<Integer> su)
    {
        if(index==arr.length)
        {
            su.add(sum);
            if(ar.size()>0)
                System.out.print(ar);
            if(ar.size()==0)
                System.out.println("[ ]");
                return;
        }
        ar.add(arr[index]);
        sum += arr[index];
        f(index+1,arr,ar,sum,su);
        ar.remove(ar.size()-1);
        sum -= arr[index];
        f(index+1,arr,ar,sum,su);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {3,1,2};
        ArrayList<Integer> ar = new ArrayList<>();
        ArrayList<Integer> su = new ArrayList<>();
        f(0,arr,ar,0,su);
        Collections.sort(su);
        System.out.println(su);        
     
    }
}
