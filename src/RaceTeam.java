import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class RaceTeam extends Team{

    Drive driver1;
    Drive driver2;


    public RaceTeam() {
        this.driver1 = new Drive();
        this.driver2 = new Drive();
    }

    public RaceTeam(String name, Car bolid1, Car bolid2, ArrayList<People> personal, Drive driver1, Drive driver2) {
        super(name, bolid1, bolid2, personal);
        this.driver1 = driver1;
        this.driver2 = driver2;
    }

    public People getDriver1() {
        return driver1;
    }

    public void setDriver1(Drive driver1) {
        this.driver1 = driver1;
    }

    public People getDriver2() {
        return driver2;
    }

    public void setDriver2(Drive driver2) {
        this.driver2 = driver2;
    }

    @Override
    public String toString() {
        return "RaceTeam{" +
                "driver1=" + driver1 +
                ", driver2=" + driver2 +
                ", name='" + name + '\'' +
                ", bolid1=" + bolid1 +
                ", bolid2=" + bolid2 +
                ", personal=" + personal +
                '}';
    }
}
