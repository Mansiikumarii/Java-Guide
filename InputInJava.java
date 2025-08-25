import java.util.Scanner;

public class InputInJava {
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your age ");
        int age = sc.nextInt();
        System.out.println(age);

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc1.nextLine();
        System.out.println(name);
    }
}
