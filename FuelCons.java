import java.util.Scanner;

public class FuelCons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter litera of diesel: ");
        double liters = sc.nextDouble();
        System.out.println("Enter distance covered in km");
        double km = sc.nextDouble();

        if(liters <0 || km<0){
            System.out.println("Invalid input");
            return;
        }
        //liter per 100 km
        double literPer100km = (liters/km)*100;
        //km to miles
        double miles = km * 0.621371;
        //liter to gallon
        double gallon = liters * 0.264172;

        double mpg = miles/gallon;

        System.out.println("Fuel consumption in liters per 100 km: " + literPer100km);
            System.out.println("Fuel consumption in miles per gallon: " + mpg);
        
    }
}
