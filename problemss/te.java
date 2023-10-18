import java.util.*;
public class te{
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(4);
        System.out.println(ar.size());
        ar.remove(0);
        System.out.println(ar.size());
    }
}