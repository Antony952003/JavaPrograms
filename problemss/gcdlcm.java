public class gcdlcm {
    public static void main(String[] args) {
        long A = 16;
        long A1 = A;
        long B = 4;
        long B1 = B;
        long gcd = 0;
        while(A!=0 && B!=0){
            if( A > B ){          
                A = A - B;
            }
            else{
                B = B - A;
            }
            System.out.println(A+" "+B);
        }
        if(A>0) gcd = A;
        if(B>0) gcd = B;
        long ans = (A1*B1)/gcd;
        Long arr[] = new Long[2];
        arr[0] = ans;
        arr[1] = gcd;
        System.out.println("The lcm is "+ans+" and the gcd is "+gcd);
    }
}
