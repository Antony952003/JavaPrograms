package dp;

public class maxnonadjsubusingforloop {
    public static void main(String[] args) {
        int arr[] = {3,4,1,2,56,66};
        int prev = arr[0];
        int prev2 = 0;
        int pick = 0;
        int notpick = 0;
        int curri = 0;
        for(int i=1;i<arr.length;i++)
        {
            pick = arr[i];
            if(i>1)
                pick += prev2;
            notpick = prev;
            curri = Math.max(pick, notpick);
            prev2 = prev;
            prev = curri;
        }
        System.out.println(prev);
        
    }
}
