import java.util.ArrayList;

public class City {
    private String name;
    private int population;
    private ArrayList<Building> buildings;
    private ArrayList<Infrastructure> infrastructures;
    private ArrayList<Resource> resources;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
        buildings = new ArrayList<Building>();
        infrastructures = new ArrayList<Infrastructure>();
        resources = new ArrayList<Resource>();
    }

    public void addBuilding(Building building) {
        buildings.add(building);
    }

    public void addInfrastructure(Infrastructure infrastructure) {
        infrastructures.add(infrastructure);
    }

    public void addResource(Resource resource) {
        resources.add(resource);
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public ArrayList<Building> getBuildings() {
        return buildings;
    }

    public ArrayList<Infrastructure> getInfrastructures() {
        return infrastructures;
    }

    public ArrayList<Resource> getResources() {
        return resources;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setBuildings(ArrayList<Building> buildings) {
        this.buildings = buildings;
    }

    public void setInfrastructures(ArrayList<Infrastructure> infrastructures) {
        this.infrastructures = infrastructures;
    }

    public void setResources(ArrayList<Resource> resources) {
        this.resources = resources;
    }

    public int getBuildingCount() {
        return buildings.size();
    }

    public int getInfrastructureCount() {
        return infrastructures.size();
    }

    public int getResourceCount() {
        return resources.size();
    }

    public double getAverageBuildingHeight() {
        double totalHeight = 0.0;
        int buildingCount = 0;
        for (Building building : buildings) {
            totalHeight += building.getSize();
            buildingCount++;
        }
        return totalHeight / buildingCount;
    }

    public int getTotalResourceQuantity() {
        int totalQuantity = 0;
        for (Resource resource : resources) {
            totalQuantity += resource.getQuantity();
        }
        return totalQuantity;
    }

    public boolean hasResource(String name) {
        for (Resource resource : resources) {
            if (resource.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String result = "City: " + name + "\n";
        result += "Population: " + population + "\n";
        result += "Buildings: " + getBuildingCount() + "\n";
        result += "Infrastructures: " + getInfrastructureCount() + "\n";
        result += "Resources: " + getResourceCount() + "\n";
        result += "Average building height: " + getAverageBuildingHeight() + "\n";
        result += "Total resource quantity: " + getTotalResourceQuantity() + "\n";
        result += "Resources available:\n";
        for (Resource resource : resources) {
            result += "- " + resource.getName() + ": " + resource.getQuantity() + "\n";
        }
        return result;
    }
}
