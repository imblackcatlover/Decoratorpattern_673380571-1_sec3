public class Americano implements Coffee {

    @Override
    public String getDescription() {
        return "Americano";
    }

    @Override
    public double getCost() {
        return 2.50;
    }
}