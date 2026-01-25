public class MethodOverloading {
    public void display(){
        System.out.println("No argument parameter");
    }
    public void display(int a){
        System.out.println("Integer paramenter:" + a);
    }
    public static void main(String[] args) {
       MethodOverloading obj = new MethodOverloading();
       obj.display();
       obj.display(10);
    }
}
