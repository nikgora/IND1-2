import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


        public class Main {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                List<String[]> data = new ArrayList<>();

                // Read data from CSV file
                try {
                    BufferedReader csvReader = new BufferedReader(new FileReader("data.csv"));
                    String row;
                    while ((row = csvReader.readLine()) != null) {
                        String[] rowData = row.split(",");
                        data.add(rowData);
                    }
                    csvReader.close();
                } catch (IOException e) {
                    System.out.println("Error reading CSV file.");
                }

                // Get input from user
                System.out.print("Enter name: ");
                String name = input.nextLine();
                System.out.print("Enter age: ");
                String age = input.nextLine();

                // Add new data to list
                String[] newData = {name, age};
                data.add(newData);

                // Write data to CSV file
                try {
                    BufferedWriter csvWriter = new BufferedWriter(new FileWriter("data.csv"));
                    for (String[] row : data) {
                        String rowString = String.join(",", row);
                        csvWriter.write(rowString);
                        csvWriter.newLine();
                    }
                    csvWriter.close();
                } catch (IOException e) {
                    System.out.println("Error writing to CSV file.");
                }

                // Print out all data in list
                for (String[] row : data) {
                    System.out.println(Arrays.toString(row));
                }
            }
        }
