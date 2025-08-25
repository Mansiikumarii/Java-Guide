public class Operators {
    public static void main(String args[]){
        //operators
        int a =40;
        int b= 2;
        int diff = a-b;
        double modulo = a%b;
        System.out.println(modulo);
        System.out.println(diff);

        //assignment operator
        int numb = 1;
        numb ++;
        System.out.println(numb);
        ++numb;
        System.out.println(numb);
        System.out.println(--numb);
        System.out.println(numb--);

        //comparison operator
        // a == b
        //a != b
        // a<= b
        //a >= b
        
        //logical operator
        if(a < 50 && b<50)
        System.out.println("both less than 50");

        // || 
        if(a < 50 || b< 50)
        System.out.println("Atleast one ");

        boolean isAdult = true;
        if(isAdult)
        System.out.println("is adult");
        else
        System.out.println("not adult");

        
    }
}
