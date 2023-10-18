public class checkifstringispresent {
    public static void main(String[] args) {
        String s1 = "geeksforgeeksgeeksforgeeks";
        String s2 = "forgeeksgeeks";
        for(int i=0;i<s2.length();i++){
            if(s1.substring(i,i + s2.length()).equals(s2))
            {
                System.out.println(1);
                break;
            }
        }
    }
}
