package studentExercises.exceptions;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadConfigFile {
    private static final String configFilePath = "src/resources/dbInfo.properties";
    private Map<String, String> myData = new HashMap<>();

    public ReadConfigFile() {
    }

    /***
     * function that returns the data in the Map .
     * @return the data in the Map 'myData'.
     */
    private Map<String, String> getMyData() {
        if (myData.isEmpty())
            throw new RuntimeException("Data Not initialized!");
        return myData;
    }

    public String get(String key){
        Map<String, String> data = getMyData();
        if(!data.containsKey(key)){
            throw new IllegalArgumentException(String.format("key %s does not exist in config", key));
        }
        return data.get(key);
    }

    /***
     * this function will try to read from the configuration file and save it in a map if it found,
     * and if the file is NOT found it will create a default file and save it in map.
     * @return the updated map that contains the data from the config file.
     */
    public void loadDataFromFile(String filePath) {

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line by the first occurrence of '='
                int equalsIndex = line.indexOf('=');
                if (equalsIndex != -1) {
                    String key = line.substring(0, equalsIndex).trim();
                    String value = line.substring(equalsIndex + 1).trim();
                    myData.put(key, value);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found!\nThe service will provide you with new file :)");

            Map<String, String> configurationMap = new HashMap<>();
            configurationMap.put("DB_PASSWORD", "Mostafa5748974");
            configurationMap.put("DB_USER", "Mostafa Mossa");
            configurationMap.put("EMAIL", "Mostafa@gmail.com");

            //write to file the default data
            writeConfigurationFile(configurationMap, filePath);
            myData = configurationMap;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /***
     * function that returns the data of the key in param.
     * @param myKey the key to find the data according to.
     * @return the data of the kay.
     */
    public String getDataByKey(String myKey) {
        if (myData.get(myKey).isEmpty())
            throw new NullPointerException("Key not found!");
        return myData.get(myKey);
    }

    /***
     * write the map data to configuration file
     * @param configurationMap map of the data
     * @param filePath configuration file path and name
     */
    public static void writeConfigurationFile(Map<String, String> configurationMap, String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            for (Map.Entry<String, String> entry : configurationMap.entrySet()) {
                String line = entry.getKey() + "=" + entry.getValue() + System.lineSeparator();
                writer.write(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
