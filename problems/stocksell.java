package problems;
import java.util.*;
public class stocksell {
    public static ArrayList<ArrayList<Integer>> stock(int arr[],int n)
    {
        ArrayList<ArrayList<Integer>> ar =  new ArrayList<>();
        int i=0;
        for(i=1;i<n;i++)
        {
            ArrayList<Integer> a = new ArrayList<>();
            if(arr[i]>arr[i-1])
            {
                a.add(i-1);
            }
            while(arr[i]>arr[i-1])
            {
                i++;
                if(i>=n)
                {
                    break;
                }

            }
            a.add(i-1);
            if(a.size()>=2)
            {
                ar.add(a);
            System.out.println("("+a.get(0)+" "+a.get(1)+")");
        }

        }

        return ar;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        ArrayList<ArrayList<Integer>> ar = stock(arr, n);




    }
}
