public class FinalVariable{

    public static void main(String[] args){
        final int speed = 40;
        // speed = speed+20; error: cannot assign a value to final variable
        System.out.println(speed);
    }
}