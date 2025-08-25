import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String args[]){
       boolean isSunUp = true;
       if(isSunUp == true)
       System.out.println("day");
       else
       System.out.println("night");
       
       int age = 30;
       if(age>18)
       System.out.println("Can vote");
       else
       System.out.println("Can't vote");
       
       Scanner sc = new Scanner(System.in);
       int cash = sc.nextInt();
       if(cash<10){
        System.out.println("Cannot buy anything");
        System.out.println("get more cash");
       }
       else if(cash > 10 && cash < 40){
        System.out.println("can get 1 thing");
       }
       else{
        System.out.println("Can get both");
       }
    }
}
