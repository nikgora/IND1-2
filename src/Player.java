public class Player {
    private String name;
    private City city;

    public Player(String name, City city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
    public void printCityInfo() {
        System.out.println("City information:");
        System.out.println(city);
    }
}
