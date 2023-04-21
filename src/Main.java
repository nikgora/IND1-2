import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BridgeBuilderGame {
    private List<Bridge> bridges; // Колекція мостів

    public BridgeBuilderGame() {
        bridges = new ArrayList<>();
    }

    // Додати міст до гри
    public void addBridge(Bridge bridge) {
        bridges.add(bridge);
    }

    // Перевірити, чи є міст стійким
    public boolean isBridgeStable(Bridge bridge) {
        // Логіка перевірки стійкості моста
        return true;
    }

    // Перевірити, чи може міст пропустити вантаж
    public boolean canBridgeSupportWeight(Bridge bridge, int weight) {
        // Логіка перевірки пропускної здатності моста
        return true;
    }

    // Зберегти мости в файл
    public void saveBridgesToFile(String fileName) {
        try {
            // Створення JSON-об'єкту та запис у файл
            JSONArray bridgesJson = new JSONArray();
            for (Bridge bridge : bridges) {
                JSONObject bridgeJson = new JSONObject();
                bridgeJson.put("type", bridge.getType());
                bridgeJson.put("length", bridge.getLength());
                bridgeJson.put("maxWeight", bridge.getMaxWeight());
                bridgeJson.put("latitude", bridge.getLatitude());
                bridgeJson.put("longitude", bridge.getLongitude());
                bridgesJson.put(bridgeJson);
            }
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(bridgesJson.toString());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Завантажити мости з файлу
    public void loadBridgesFromFile(String fileName) {
        try {
            // Зчитування JSON-об'єкту з файлу та ініціалізація колекції мостів
            bridges.clear();
            JSONTokener tokener = new JSONTokener(new FileReader(fileName));
            JSONArray bridgesJson = new JSONArray(tokener);
            for (int i = 0; i < bridgesJson.length(); i++) {
                JSONObject bridgeJson = bridgesJson.getJSONObject(i);
                Bridge bridge = new Bridge(
                        bridgeJson.getString("type"),
                        bridgeJson.getInt("length"),
                        bridgeJson.getInt("maxWeight"),
                        bridgeJson.getDouble("latitude"),
                        bridgeJson.getDouble("longitude")
                );
                bridges.add(bridge);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Клас для тестування та демонстрації функціональності
    public static void main(String[] args) {

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

        BridgeBuilderGame game = new BridgeBuilderGame();

        // Додавання мостів до гри
        Bridge bridge1 = new Bridge("Beam", 50, 100);
        game.addBridge(bridge1);
        Bridge bridge2 = new Bridge("Truss", 80, 150);
        game.addBridge(bridge2);

        // Перевірка стійкості мостів
        System.out.println("Bridge 1 is stable: " + game.isBridgeStable(bridge1));
        System.out.println("Bridge 2 is stable: " + game.isBridgeStable(bridge2));

        // Перевірка пропускної здатності мостів
        int weight1 = 120;
        System.out.println("Bridge 1 can support weight of " + weight1 + ": " + game.canBridgeSupportWeight(bridge1, weight1));
        int weight2 = 200;
        System.out.println("Bridge 2 can support weight of " + weight2 + ": " + game.canBridgeSupportWeight(bridge2, weight2));

        // Збереження мостів у файл
        game.saveBridgesToFile("bridges.json");

        // Завантаження мостів з файлу
        game.loadBridgesFromFile("bridges.json");
        System.out.println(game.bridges);
    }
}


