package OOP;

public class Fraction {
   
    public static int gcd(int num, int den){
        int min= Math.min(num, den);
        for(int i=min; i>=1; i--){
            if(num%i ==0 && den%i == 0)
            return i;
        }
        return min;
    }
    public static class Fract{
        int num;
        int den;
        public Fract(int num, int den){
            this.num = num;
            this.den = den;
            simplify();
        }
        public void simplify(){
            int hcf = gcd(num,den);
            num /= hcf;
            den /= hcf;
        }
    }
    public static Fract add(Fract f1, Fract f2){
        int numerator = f1.num*f2.den + f2.num*f1.den;
        int denominator = f1.den*f2.den;

        return new Fract(numerator, denominator);

    }
    public static Fract mulFract(Fract f1, Fract f2){
        int numerator = f1.num*f2.num;
        int denominator = f1.den*f2.den;

        return new Fract(numerator, denominator);

    }
    public static void main(String[] args) {
        Fract f1 = new Fract(7,21);

        System.out.println(f1.num+"/"+f1.den);
       Fract f2 = new Fract(7, 3);
       System.out.println(f2.num+"/"+f2.den);
       Fract f3 = add(f1,f2);
       System.out.println(f3.num+"/"+f3.den);
       Fract f4 = mulFract(f1, f2);
       System.out.println(f4.num+"/"+f4.den);
    }
}
