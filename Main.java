public class Main {

    public static void main(String[] args) {

        // Test Case 1
        Coffee coffee1 = new Espresso();

        System.out.println("Test Case 1");
        System.out.println("Configuration: Espresso");
        System.out.println("Description: " + coffee1.getDescription());
        System.out.printf("Total Cost: $%.2f%n", coffee1.getCost());

        System.out.println();

        // Test Case 2
        Coffee coffee2 = new MilkDecorator(
                new Espresso()
        );

        System.out.println("Test Case 2");
        System.out.println("Configuration: Espresso + Milk");
        System.out.println("Description: " + coffee2.getDescription());
        System.out.printf("Total Cost: $%.2f%n", coffee2.getCost());

        System.out.println();

        // Test Case 3
        Coffee coffee3 = new WhippedCreamDecorator(
                new SugarDecorator(
                        new MilkDecorator(
                                new Americano()
                        )
                )
        );

        System.out.println("Test Case 3");
        System.out.println("Configuration: Americano + Milk + Sugar + Whipped Cream");
        System.out.println("Description: " + coffee3.getDescription());
        System.out.printf("Total Cost: $%.2f%n", coffee3.getCost());
    }
}