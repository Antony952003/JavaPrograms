import java.util.*;
public class string{
    static int sumof(String s){
        int sum = 0;
        int i = 0;
        s = s.toUpperCase();
        int j = s.length() - 1;
        while(i<=j){
            if(i == j){
                sum += (Math.abs((int)s.charAt(i) - (int)'A') + 1);
            }
            else{
                sum += Math.abs((int)s.charAt(i) - (int)s.charAt(j));
            }
            i++;
            j--;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String arr[] = s.split(" ");
        String ans = "";
        for(int i=0;i<arr.length;i++){
            ans += sumof(arr[i]);
        }
        System.out.println(Integer.parseInt(ans));
    }
}