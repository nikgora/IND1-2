import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Race Teams
 */
public class Main {
    //считывание книг с файла

    public static void main(String[] args) throws Exception {
        ArrayList<RaceTeam> raceTeams = new ArrayList<RaceTeam>(5);
        for (int i = 0; i < 1; i++)
        {
            raceTeams.add(i,new RaceTeam(  "Team: "+(i),new Car("car: "+(1),"motor: "+i,"f2"),new Car("car: "+(2),"motor: "+i,"f2"),new ArrayList<>(0),new Drive(Integer.toString(i),"gora",12,"race",0),new Drive(Integer.toString(i),"gora",12,"race",0)));
        }
        ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(new FileOutputStream(new File("line.data")));
        RaceTeam raceTeam = raceTeams.get(0);
        objectOutputStream.writeObject(raceTeam);
        objectOutputStream.close();
    }
}