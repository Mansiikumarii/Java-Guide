public class Operators{
   public static void main(String[] args){
    int x = 100+50;
    System.out.println(x);

    //minus operator
    int x1 = 100-50;
    System.out.println(x1);

    //multiplication operator
    int x3 = 10*6;
    System.out.println(x3);

    //division operator
    int x4 = 100/50;
    System.out.println(x4);

    //modulus operator
    int x5 = 10%3;
    System.out.println(x5);

    //increment operator
    int x6 = 5;
    System.out.println(x6);
    x6++;
    System.out.println(x6);

    //decrement operator
    int x7 = 5;
    System.out.println(x7);
    x7--;
    System.out.println(x7);

    //Assignment operator
    int x8 = 5;
    System.out.println(x8);
    x8 += 5;
    System.out.println(x8);

    //minus equals
    x8 -= 3;
    System.out.println(x8);

    x8 *= 3;
    System.out.println(x8);

    x8 /= 2;
    System.out.println(x8);

    x8 %= 2;
    System.out.println(x8);

    //comparision operators
    int x9 = 5;
    System.out.println(x9 == 5);

    System.out.println(x9 != 3);

    //grater or less than
    System.out.println(10>9);
    System.out.println(3<2);

    //greater than / less than or equal
    System.out.println(5>= 5);

    //Logical operator
    System.out.println(x9 <5 && x9 <10);

    //or operator
    System.out.println(x9 <5 || x9 <10);

    //not operator
    System.out.println(!(x9 <5 && x9 <10));
   } 
}
