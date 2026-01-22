
interface RBI{
    void message();
}
interface SBI extends RBI{
    default void message(){
        System.out.println("Welcome to SBI");
    }
}
interface AXIS extends RBI{
    default void message(){
        System.out.println("Wecome to AXIS");
    }
}

public class DiamondProb implements SBI, AXIS{
    public void message(){
        SBI.super.message();
        AXIS.super.message();
    }
    public static void main(String[] args) {
        DiamondProb obj = new DiamondProb();
        obj.message();
    }
}
