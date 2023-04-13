public class GCD {
    static int gcd(int x, int y) {
        if(x<y){
            int temp = x;
            x=y;
            y=temp;
        }
        if (y==0)
            return x;
        return gcd(y, x%y);
    }
    public static void main(String[] args) {

        System.out.println(gcd(24, 18));
    }

}
