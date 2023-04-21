public class Bridge {
    private String type;
    private int length;
    private int maxWeight;
    private double latitude;
    private double longitude;

    public Bridge(String type, int length, int maxWeight) {
        this.type = type;
        this.length = length;
        this.maxWeight = maxWeight;
    }

    public Bridge(String type, int length, int maxWeight, double latitude, double longitude) {
        this.type = type;
        this.length = length;
        this.maxWeight = maxWeight;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Bridge{" +
                "type='" + type + '\'' +
                ", length=" + length +
                ", maxWeight=" + maxWeight +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
