public class Car {
    String name;
    String motor;
    String base;

    public Car(String name, String motor, String base) {
        this.name = name;
        this.motor = motor;
        this.base = base;
    }

    public Car() {
        name="";
        motor="";
        base="";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", motor='" + motor + '\'' +
                ", base='" + base + '\'' +
                '}';
    }
}
