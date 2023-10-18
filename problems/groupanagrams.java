package problems;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class groupanagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.next();
        }
        List<List<String>> ar = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for(String cur:arr)
        {
            char array[] = cur.toCharArray();
            Arrays.sort(array);
            String s = new String(array);
            if(!map.containsKey(s))
            {
                map.put(s,new ArrayList<>());
            }
            map.get(s).add(cur);
        }
        ar.addAll(map.values());
        System.out.println(ar);
    }
}
