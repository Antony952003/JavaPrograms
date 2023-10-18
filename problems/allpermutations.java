import java.util.*;
public class allpermutations {
    public static void f(int arr[],ArrayList<Integer> ar,boolean chk[])
    {
        if(ar.size()==arr.length)
        {
            System.out.println(ar);
            return;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(!chk[i])
            {
                chk[i] = true;
                ar.add(arr[i]);
                f(arr, ar, chk);
                ar.remove(ar.get(ar.size()-1));
                chk[i] = false; 
            }
        }
        return;
    }
    public static void main(String[] args) {
        char a = 'a'+ 4;
        System.out.println(a);
        int arr[] = {1,2,3};
        ArrayList<Integer> ar =  new ArrayList<>();
        boolean chk[] = new boolean[arr.length];
        f(arr,ar,chk);
    }
}
