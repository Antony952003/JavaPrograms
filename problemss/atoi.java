import java.util.*;
public class atoi{
    static int f(String str){
        str = str.trim();
        int sign = 1;
        if(Character.isAlphabetic(str.charAt(0))){
            return -1;
        }
        int i = 0;
        if(str.charAt(0) == '+' || str.charAt(0) == '-')
            i = 1;
        int ans = 0;
        while(i < str.length()){
            if(str.charAt(i) == ' ' || Character.isAlphabetic(str.charAt(i)))
                return ans;
            ans = ans * 10 + (str.charAt(i) - '0');
            if(ans*-1 < Integer.MIN_VALUE)  return Integer.MIN_VALUE;
            if(ans*1 > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            i++;
        }
        return ans; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int ans = f(str);
        System.out.println(ans);
        
        
    }
}