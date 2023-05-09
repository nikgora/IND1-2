import java.sql.Driver;
import java.util.ArrayList;

public class Team {
    String name;
    Car bolid1;
    Car bolid2;
    ArrayList<People> personal;


    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", bolid1=" + bolid1 +
                ", bolid2=" + bolid2 +
                ", personal=" + personal +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getBolid1() {
        return bolid1;
    }

    public void setBolid1(Car bolid1) {
        this.bolid1 = bolid1;
    }

    public Car getBolid2() {
        return bolid2;
    }

    public void setBolid2(Car bolid2) {
        this.bolid2 = bolid2;
    }

    public ArrayList<People> getPersonal() {
        return personal;
    }

    public void setPersonal(ArrayList<People> personal) {
        this.personal = personal;
    }

}
