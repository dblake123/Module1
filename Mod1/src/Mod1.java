import java.util.Scanner;
import java.math.RoundingMode;  
import java.text.DecimalFormat;  
class mod1 {
    private static final DecimalFormat twoDecFormat = new DecimalFormat("0.00");  

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);  
        System.out.println("Hello I calculate Fuel Efficiency.");
        System.out.println("I will calculate the cost per 100 miles and how far your car can go on a full tank of gas.");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Please enter the number of gallons of gas the tank can hold. (Whole Number) Ex: 15");
        Float gallons = input.nextFloat();  

        System.out.println("Please enter the fuel efficiency in miles per gallon. (Whole Number) Ex: 30");
        Float fuelEff = input.nextFloat();  

        System.out.println("Please enter the price of a gallon of gas. (Exact Price) Ex: 4.56");
        Float priceOfFuel = input.nextFloat();  
        input.close();

        System.out.println("Tank holds: " + String.format("%.0f",gallons) + " Gallons");
        System.out.println("Fuel Efficiency: " + String.format("%.0f",fuelEff) + " miles per gallon");
        System.out.println("Price of a gallon of Gas: $" + twoDecFormat.format(priceOfFuel));

        float cost100 = (100 /fuelEff) * priceOfFuel;
        float carDistance = gallons * fuelEff;

        System.out.println("Cost to go 100 miles: $" + twoDecFormat.format(cost100));
        System.out.println("Car Distance on full tank of gas: " + String.format("%.0f",carDistance) + " miles");
    }
}
