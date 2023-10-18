import java.util.Scanner;

public class caesar {

    static String encode(String str,int n){
        String ans = "";
        for(int i=0;i<n;i++){
            if(Character.isUpperCase(str.charAt(i))){
                int val = (int)(str.charAt(i) + 3);
                if(val > 90){
                    val = (val % 90) + 64;
                }
                char alp = (char)val;
                ans += alp;
            }
            else{
                int val = (int)(str.charAt(i) + 3);
                if(val > 122){
                    val = (val % 122) + 96;
                }
                char alp = (char)val;
                ans += alp;
            }
        }
        return ans;
    }
    static String decode(String str,int n){
        String ans = "";
        for(int i=0;i<n;i++){
            if(Character.isUpperCase(str.charAt(i))){
                int val = (int)(str.charAt(i) - 3);
                if(val < 65){
                    val = 91 - (65 - val); 
                }+
                char alp = (char)val;
                ans += alp;
            }
            else{
                int val = (int)(str.charAt(i) - 3);
                if(val < 97){
                    val = 123 - (97 - val);
                }
                char alp = (char)val;
                ans += alp;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String en = encode("antony", 6);
        System.out.println("The Encoded String is : "+en);
        String de = decode(en, 6);
        System.out.println("The Decoded String is : "+de);
            // b - 98 = > 97 - 95 = 2 122 - 2;
        
    }
}
