public class ResidentialBuilding extends Building {
    private int numBedrooms;

    public ResidentialBuilding(int cost, int maintenanceCost, int size, int efficiencyLevel, int numResidentialUnits, int numCommercialUnits, int numBedrooms) {
        super(cost, maintenanceCost, size, efficiencyLevel, numResidentialUnits, numCommercialUnits);
        this.numBedrooms = numBedrooms;
    }

    public int getNumBedrooms() {
        return numBedrooms;
    }

    public void setNumBedrooms(int numBedrooms) {
        this.numBedrooms = numBedrooms;
    }
}
