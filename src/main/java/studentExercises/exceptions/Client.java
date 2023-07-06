package studentExercises.exceptions;

import java.util.Map;

public class Client {
    public static void main(String[] args) {
        ReadConfigFile myService = new ReadConfigFile();
        Map<String, String> myData;

        myService.loadDataFromFile("file.txt");

        System.out.println(myService.get("NONE"));
    }
}


