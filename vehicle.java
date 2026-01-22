public class vehicle {
    int wheelsCount;

    void start(){
        System.out.println("Vechical is starting");
    }
    String model;
    vehicle(){
        System.out.println("Creating a vehicle instance");
    }
    vehicle(int wheelsCount){
        this.wheelsCount = wheelsCount;
        System.out.println("Creating vehicle with wheels: " + wheelsCount);
    }
}
