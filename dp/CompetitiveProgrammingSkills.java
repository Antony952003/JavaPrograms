public class CompetitiveProgrammingSkills {
    public static int minAddition(int N, int[] A, int[] G) {
        int minA = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            minA = Math.min(minA, A[i]);
        }
        int minG = Integer.MAX_VALUE;
        for (int i = 0; i < G.length; i++) {
            minG = Math.min(minG, G[i]);
        }
        return minG - minA;
    }
    public static void main(String[] args) {
        int A[] = {4,3,1,2};
        int N = 4;
        int G[] ={7,4};
        System.out.println(minAddition(N, A, G));
    }
}
