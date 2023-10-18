package dp;
import java.util.ArrayList;
import java.util.Scanner;

public class climbingstairs {
    static void f(int n,ArrayList<Integer> ar,int sum,ArrayList<ArrayList<Integer>> arr)
    {
        if(sum==n)
        {
            arr.add(new ArrayList<>(ar));
            return;
        }
        else if(sum>n)
        {
            return;
        }
        else{
        for(int i=1;i<=2;i++)
        {
            ar.add(i);
            sum += i;
            //System.out.println(sum);
            f(n,ar,sum,arr);
            sum -= i;
            ar.remove(ar.size()-1);
            }
        }
        return;
    }
    static int fun(int ind,int n)
    {
        if(ind == 0)
        {
            return 1;
        }
        if(ind == 1)
        {
            return 1;
        }
        int left = fun(ind-1,n);
        int right = fun(ind-2, n);
        return left+right;
    }      
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> ar = new ArrayList<>();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        //f(n,ar,0,arr);
        //System.out.println(arr.size());
        System.out.println(fun(n, n));

    }
}
