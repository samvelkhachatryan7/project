package book;


import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonFunctionality {
    private static final String FILE_PATH = "/Users/samvelkhachatryan/IdeaProjects/Lessons/src/users.json";

    public static void writeDataToJsonFile(String obj) {
        try {
            FileWriter fileWriter = new FileWriter(FILE_PATH);
            fileWriter.write(obj);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readJson() {
        StringBuilder sb = new StringBuilder();
        try (FileReader fileReader = new FileReader(FILE_PATH)) {
            int i;
            while ((i = fileReader.read()) != -1) {
                sb.append((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public static String getDataFromJson(String key) {
        JsonElement root = new JsonParser().parse(readJson());
        return root.getAsJsonObject().get(key).getAsString();
    }
}