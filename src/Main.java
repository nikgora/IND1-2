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
        ArrayList<RaceTeam> raceTeams;
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("data.data")));

            raceTeams = (ArrayList<RaceTeam>) objectInputStream.readObject();
            System.out.println(raceTeams);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        //some operation




        // Print to file
        ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(new FileOutputStream(new File("data.data")));
        objectOutputStream.writeObject(raceTeams);
        objectOutputStream.close();


    }
}