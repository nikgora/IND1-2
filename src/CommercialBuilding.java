public class CommercialBuilding extends Building {
    private String name;
    private int numberOfEmployees;
    private double revenue;

    public CommercialBuilding(String name, double length, double width, int numFloors, int numUnits, int buildCost, int upkeepCost) {
        super(length, width, numFloors, numUnits, buildCost, upkeepCost);
        this.name = name;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public void addRevenue(double amount) {
        revenue += amount;
    }

    public double calculateProfit() {
        return revenue - getMaintenanceCost() * numberOfEmployees;
    }
}

