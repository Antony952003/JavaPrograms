import java.util.Scanner;

public class reversebinary {
    static int f(int N){
        int ans = 0;
        for(int i=1;i<=Math.sqrt(N);i++){
            if(N % i == 0){
                ans += i;
                if((N/i)!=i)
                    ans += (N/i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int ans = 0;
        for(int i=1;i<=21;i++){ 
            ans += f(i);
        }
        System.out.println(ans);
    }
}
