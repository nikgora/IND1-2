
public class Building {
    private double cost;
    private double maintenanceCost;
    private int size;
    private int efficiencyLevel;
    private int numResidentialUnits;
    private int numCommercialUnits;


    public Building(double cost, double maintenanceCost, int size, int efficiencyLevel, int numResidentialUnits, int numCommercialUnits) {
        this.cost = cost;
        this.maintenanceCost = maintenanceCost;
        this.size = size;
        this.efficiencyLevel = efficiencyLevel;
        this.numResidentialUnits = numResidentialUnits;
        this.numCommercialUnits = numCommercialUnits;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public double getMaintenanceCost() {
        return maintenanceCost;
    }

    public void setMaintenanceCost(int maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getEfficiencyLevel() {
        return efficiencyLevel;
    }

    public void setEfficiencyLevel(int efficiencyLevel) {
        this.efficiencyLevel = efficiencyLevel;
    }

    public int getNumResidentialUnits() {
        return numResidentialUnits;
    }

    public void setNumResidentialUnits(int numResidentialUnits) {
        this.numResidentialUnits = numResidentialUnits;
    }

    public int getNumCommercialUnits() {
        return numCommercialUnits;
    }

    public void setNumCommercialUnits(int numCommercialUnits) {
        this.numCommercialUnits = numCommercialUnits;
    }

    public void build() {
        // Implementation for building the building
    }

    public void demolish() {
        // Implementation for demolishing the building
    }


}

