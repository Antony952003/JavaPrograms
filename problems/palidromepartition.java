package problems;
import java.util.ArrayList;

public class palidromepartition {
    static void f(int index,String str,ArrayList<ArrayList<String>> res,ArrayList<String> ar)
    {
        if(index == str.length())
        {
            res.add(new ArrayList<>(ar));
        }
        for(int i=index;i<str.length();i++)
        {
            if(ispalin(str,index,i))
            {
                ar.add(str.substring(index, i+1));
                f(i+1, str, res, ar);
                ar.remove(ar.get(ar.size()-1));
            }
        }
        return;
    }
    static boolean ispalin(String str,int start,int end)
    {
        while(start<=end)
        {
            if(str.charAt(start++)!=str.charAt(end--))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {

        String str = "aabb";
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        ArrayList<String> ar = new ArrayList<>();
        f(0,str,res,ar);
        System.out.println(res);
    }
}
