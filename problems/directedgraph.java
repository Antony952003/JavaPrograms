package problems;
import java.util.*;
public class directedgraph {
    LinkedList<Integer> adj[]; 
    public directedgraph(int v)
    {
        adj = new LinkedList[v];
        for(int i=0;i<v;i++)
        {
            adj[i] = new LinkedList<>();
        }
    }
    public void insertedge(int s, int d)
    {
        adj[s].add(d);
        adj[d].add(s);

    }

    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of Vertices :");
        int v = sc.nextInt();
        System.out.println("Enter the no of Edges :");
        int e = sc.nextInt();
        directedgraph dir = new directedgraph(v);
        System.out.println("Insert the edges one by one :");
        for(int i=0;i<e;i++)
        {
            int s = sc.nextInt();
            int d = sc.nextInt();
            dir.insertedge(s,d);
        }



    }
}
