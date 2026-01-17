import java.util.*;
public class Switch_case {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter a number of dish you want to order");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("Litti Chokha");
                break;
            case 2:
                System.out.println("Shami Kebabs");
                break;
            case 3:
                System.out.println("Lucknowi Biryani");
                break;
            case 4:
                System.out.println("Chole Bhature");
                break;
            case 5:
                System.out.println("Dal Baati Churma");
                break;
            case 6:
                System.out.println("Rogan Josh");
                break;
            case 7:
                System.out.println("Kashmiri Kahwa");
                break;
            default:
                System.out.println("Nimbu Pani");
                break;
        }
        System.out.println("Thanks! for ordering from our restaurant.");
    }
}
