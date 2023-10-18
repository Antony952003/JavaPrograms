package problems;

import java.util.*;

public class tripletszero {
/*     static boolean f(int i,int arr[],ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> ar,int n,int sum)
    {
        if(i>=n)
        {
            if(ar.size() == 3 && sum == 0)
            {
                ans.add(new ArrayList<>(ar));
                return true;
            }
            return false;
        }
        ar.add(arr[i]);
        boolean take = f(i+1,arr,ans,ar,n,sum + arr[i]);
        ar.remove(ar.get(ar.size()-1));
        boolean nottake = f(i+1,arr,ans,ar,n,sum);

        return take | nottake;
    } */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        List<List<Integer>> ans = new LinkedList<>();
        Arrays.sort(arr);
        for(int i=0;i<n-2;i++)
        {
            if(i == 0 || arr[i] != arr[i-1])
            {
                int lo = i+1;
                int hi = n-1;
                sum = -arr[i];
                while(lo<hi)
                {
                    if(arr[lo] + arr[hi] == sum)
                    {
                        ans.add(Arrays.asList(arr[i],arr[lo],arr[hi]));
                        while(lo<hi && arr[lo] == arr[lo+1])   lo++;
                        while(lo<hi && arr[hi] == arr[hi-1])   hi--;
                        lo++;
                        hi--;
                    }
                    else if(arr[lo] + arr[hi] < sum)
                    {
                        lo++;
                    }
                    else    hi--;
                }
            }
        }
        System.out.println(ans);
        /* for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if((arr[i] + arr[j] + arr[k]) == 0)
                    {
                        ArrayList<Integer> ar = new ArrayList<>();
                        ar.add(arr[i]);ar.add(arr[j]);ar.add(arr[k]);
                        if(!ans.contains(ar))
                            ans.add(ar);
                    }
                }
            }
        } */


    }
}
