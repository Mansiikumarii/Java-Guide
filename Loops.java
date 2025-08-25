import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        System.out.println("1");

        for(int i =1; i<=100; i++ ){
            System.out.println(i);
        }

        //100-1
        for(int i=100; i>=1; i--){
            System.out.println(i);
        }

        //While loop
        int i=100;
        while (i>=1) {
            System.out.println(i);
            i--;
        }

        //Do while
        int k= 100;
        do{
            System.out.println(k);
            k--;
        }
        while(k >=1);

        Scanner sc = new Scanner(System.in);
        int number =0;
        do{
            System.out.println("Input a number");
            number = sc.nextInt();
            System.out.print("Here is your number :");
            System.out.println(number);
        }
        while (number>=0); 
            System.out.println("THE END");
        
    }
}
