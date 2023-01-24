import jdk.javadoc.internal.doclets.toolkit.taglets.SystemPropertyTaglet;

public class CarCostEstimator {
    public static void main(String[] args) {
        
        /* Defining Initial Car Cost and Variables */
        double carOneInitialCost = 12000;
        double carTwoInitialCost = 18000;
        double DriveDistance = 100000;

        /*  Defining Initial Fuel Cost */
        double carOneFuelCostPerLitre = 1.1;
        double carOneKilometrePerLitre = 20.0;
        double carTwoFuelCostPerLitre = 1.4;
        double carTwoKilometrePerLitre = 35.0;

        /* Defining Service Costs */
        double carOneServiceInterval = 15000.0;
        double carOneServiceCost = 100.0;
        double carTwoServiceInterval = 25000.0;
        double carTwoServiceCost = 200.0;

        /* Formula For Fuel Per 100K KM */
        double carOneFuelCost = 
        DriveDistance / carOneKilometrePerLitre * carOneFuelCostPerLitre;
        double carTwoFuelCost = 
        DriveDistance / carTwoKilometrePerLitre * carTwoFuelCostPerLitre;

        /* Formula For Service Per 100K KM */
        double carOneServiceCosts = 
        Math.floor(DriveDistance / carOneServiceInterval) * carOneServiceCost;
        double carTwoServiceCosts = 
        Math.floor(DriveDistance / carTwoServiceInterval) * carTwoServiceCost;

        /* Formula For Total Costs Of Cars*/
        double carOneTotalCost = carOneFuelCost + carOneServiceCosts;
        double carTwoTotalCost = carTwoFuelCost + carTwoServiceCosts;


        /* Printing Out The Car Costs For Car One */
        System.out.println("Car One For 100K KM Will Be £" + 
        (carOneInitialCost + carOneTotalCost));
        System.out.println("Car One For 200K KM Will Be £" + 
        (carOneInitialCost + (2 * carOneTotalCost)));
        System.out.println("Car One For 300K KM Will Be £" + 
        (carOneInitialCost + (3 * carOneTotalCost)));
        System.out.println("Car One For 400K KM Will Be £" + 
        (carOneInitialCost + (4 * carOneTotalCost)));
        System.out.println("Car One For 500K KM Will Be £" + 
        (carOneInitialCost + (5 * carOneTotalCost)));
        
        System.out.println("Car Two For 100K KM will be £" + 
        (carTwoInitialCost + carTwoTotalCost));
        System.out.println("Car Two For 200K KM will be £" + 
        (carTwoInitialCost + (2 * carTwoTotalCost)));
        System.out.println("Car Two For 300K KM will be £" + 
        (carTwoInitialCost + (3 * carTwoTotalCost)));
        System.out.println("Car Two For 400K KM will be £" + 
        (carTwoInitialCost + (4 * carTwoTotalCost)));
        System.out.println("Car Two For 500K KM will be £" + 
        (carTwoInitialCost + (5 * carTwoTotalCost)));
        



    }
}