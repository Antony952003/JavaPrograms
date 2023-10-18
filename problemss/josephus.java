import java.util.ArrayList;

public class josephus {
    static int josephus(int n, int k)
    {
    if (n == 1)
        return 1;
    else
        return (josephus(n - 1, k) + k-1) % n + 1;
    }
    public static void main(String[] args) {
        //System.out.println(josephus(100, 2));
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(2);
        System.out.println(ar);
        System.out.println(ar.get(ar.size()-1));
    }
}
