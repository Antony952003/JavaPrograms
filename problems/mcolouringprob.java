package problems;
import java.util.ArrayList;

public class mcolouringprob {
    static boolean issafe(int index,ArrayList<Integer> g,int color[],int col,int m)
    {
        for(int i:g)
        {
            if(color[i] == col)
                return false;
        }
        return true;
    }
    static boolean solve(int index,ArrayList<Integer> g,int color[],int n,int m)
    {
        if(index == n)
        {
            return true;
        }
        for(int i=1;i<=m;i++)
        {
            if(issafe(0,g,color,i,m))
            {
                color[index] = i;
                if(solve(index+1, g, color,n,m))
                    return true;
                color[index] = 0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> g = new ArrayList<>();
        int m = 3;
        int color[] = new int[m];
        int n = g.size();
        solve(0,g,color,n,m);

    }
}
