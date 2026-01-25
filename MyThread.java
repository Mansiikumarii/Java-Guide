class t extends Thread{
    public void run(){
        System.out.println("Program is running");
    }
}
public class MyThread {
    public static void main(String[] args) {
        t t1 = new t();
        t1.start();
    }
}
