public class minsquares {

    public static int MinSquares(int n)
    {
        if(n <= 3)  return n;
        int min = 99999;
        for(int i=1;i<=(int)Math.floor(Math.sqrt(n));i++){
            int cur = 0;
            int val = n;
            int j = i;
            while(val > 0){
                while(j*j > val)  j--;
                val = val - (j*j);
                cur++;
            }
            min = Math.min(min,cur);
        }
        return min;
    }
    public static void main(String[] args) {
        System.out.println(MinSquares(5));
    }   
}
