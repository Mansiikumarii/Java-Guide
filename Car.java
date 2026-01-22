public class Car extends vehicle{

    String color;

    void start(){
        super.start();
        System.out.println(this);
        System.out.println(this.model +"Car is starting");
    }
    Car(){
        super(3);
        System.out.println("Car is being called");
    }
    public static void main(String[] args) {
        Car obj = new Car();
        obj.wheelsCount = 4;
        obj.start();
        obj.model = "I10";
        obj.color = "Red";
        obj.start();System.out.println(obj.wheelsCount);
    }
}
    

