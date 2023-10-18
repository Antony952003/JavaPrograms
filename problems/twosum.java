package problems;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class twosum {
    static void f(int i,int arr[],int n,int target,ArrayList<Integer> ar, ArrayList<ArrayList<Integer>> d)
    {
        if(i == n)
        {
            if(target == 0 && ar.size()==2)
            {
            d.add(new ArrayList<>(ar));
            return;
            }
            else
                return;
        }
        if(Math.abs(arr[i])<=Math.abs(target))
        {
            ar.add(i);
            f(i+1, arr, n, target - arr[i], ar,d);
            ar.remove(ar.get(ar.size()-1));
        }
        f(i+1, arr, n, target, ar,d);
        return;
        
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        ArrayList<Integer> ar = new ArrayList<>();
        ArrayList<ArrayList<Integer>> d = new ArrayList<>();
        f(0,arr,n,target,ar,d);
/*         for(int i=0;i<d.size();i++)
        {
            if(d.get(i).size() == 2)
            arr[0] = d.get(0).get(0);
            arr[1] = d.get(0).get(1);
        } */
        System.out.println(d);
        //System.out.println(arr[0]+" "+arr[1]);
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(4, 1);
        map.put(4,map.get(4)+1);
    }
}
