package dp;

import java.util.ArrayList;
import java.util.Scanner;

public class printsubsequences {
    static void f(int index,char arr[],int n,ArrayList<Character> ar,ArrayList<ArrayList<Character>> des)
    {
        if(index == arr.length)
        {
            des.add(new ArrayList<>(ar));
            //System.out.println(ar);
            return;
        }
        ar.add(arr[index]);
        f(index+1, arr, n, ar,des);
        ar.remove(ar.get(ar.size()-1));
        f(index+1, arr, n, ar,des);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "adcbc";
        char arr[] = str.toCharArray();
        ArrayList<Character> ar = new ArrayList<>();
        ArrayList<ArrayList<Character>> des = new ArrayList<>();
        f(0,arr,str.length(),ar,des);
        System.out.println(des);
    }
}
