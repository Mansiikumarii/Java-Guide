public class RangeSum {
    static int sumNatural(int n){
        int sum = n*(n+1)/2;
        return sum;
    }
    static int sumInRange(int l, int r){
        return sumNatural(r) - sumNatural(l-1);
    }

    public static void main(String[] args) {
        int l = 3, r=7;
        System.out.println(sumInRange(l, r));
    }
}
