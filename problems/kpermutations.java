package problems;
import java.util.ArrayList;
import java.util.Scanner;

public class kpermutations {
    static void f(int arr[],ArrayList<Integer> ar,int n,ArrayList<ArrayList<Integer>> ans)
    {
        if(ar.size()==n)
        {
           // System.out.println(ar);
            ans.add(new ArrayList<>(ar));
            return;
        }
        for(int i=0;i<n;i++)
        {
            if(!ar.contains(arr[i]))
            {
            ar.add(arr[i]);
            f(arr, ar, n, ans);
            ar.remove(ar.get(ar.size()-1));
            }
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = i+1; 
        }
        ArrayList<Integer> ar = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        f(arr,ar,n,ans);
        System.out.println();
        String s = ans.get(k-1).toString();
        String str = "";
        for(int i=1;i<s.length();i=i+3)
        {
                str += s.charAt(i);
        }
        System.out.println(str);
        
        
    }
}
