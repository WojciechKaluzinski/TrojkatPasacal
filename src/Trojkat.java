public class Trojkat {
    private static int factorial(int n) {
        int f;

        for(f = 1; n > 1; n--){
            f *= n;
        }
        return f;
    }
    static int ncr(int n,int r) {
        int i = factorial(n) / (factorial(n - r) * factorial(r));
        return i;
    }

}
