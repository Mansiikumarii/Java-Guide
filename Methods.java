public class Methods {
    public static void printJava(){
        System.out.println("Hello Mansi!!");
    }
    public static void printName(String name) {
        System.out.println(name);
    }
    public static void printSum(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }
    public static void main(String[] args) {
       printJava();
       printJava();
       printJava();
       printName("Anupriya");
       printName("Papa Jii");
       printSum(11, 66);
    }
}
