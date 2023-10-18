import java.util.*;
public class lowercase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        Set<Integer> sss = new HashSet<>();
        String s = sc.next();
        int i = 0;
        while(i < s.length()){
            String ans = "";
            if(Character.isLowerCase(s.charAt(i))){
                while(i< s.length() && Character.isLowerCase(s.charAt(i))){
                    ans += (s.charAt(i) + "").toUpperCase();
                    i++;
                }
            }
            else {
                ans += (s.charAt(i) + "").toLowerCase();
                i++;
                while(i< s.length() && Character.isLowerCase(s.charAt(i))){
                    ans += (s.charAt(i) + "").toUpperCase();
                    i++;
                }
            }
            System.out.println(ans);
        }
    }
}