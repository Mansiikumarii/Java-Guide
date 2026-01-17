import java.util.*;
public class Wrapper{
    public static void main(String[] args) {
        int num = 7;
        Integer num1 =8; //boxing
        Integer num2 = num; //autoboxing
        int num3 = num; //auto-unboxing

        boolean hasGraphics = true;
        Boolean isAdult = true;

        Float f= 10.5f;
        Double d = 1.2;
        Character c = 'c';
        Byte bb = 1;
        Short s = 2;
        Long l = 123l;

        //primitive to object : boxing
        //primitive to integer : autoboxing

        Integer A = 1;
        Integer B = 2;
        System.out.print(A+B);

        System.out.println(Integer.max(1,2));
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.min(1,2));
        String str = "123";
        Integer i = Integer.valueOf(str); //works only with a valid number
        //valueOf() → converts String → Integer
        int num4 = Integer.parseInt(str); //parseInt() → converts String → int
        System.out.println(num4*2);
        System.out.println(i);
    }
}
