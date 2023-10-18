import java.util.*;
public class powerset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> res = new ArrayList<>();
        int n = str.length();
        for(int i = 0;i<(1 << n);i++){
            String s = "";
            for(int j=0;j<n;j++){
                if((i & (1 << j)) != 0){
                    s += str.charAt(j);
                }
            }
            res.add(s);
        }
        System.out.println(res);
    }
}
