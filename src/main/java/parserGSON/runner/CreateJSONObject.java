package parserGSON.runner;

import com.google.gson.Gson;
import parserGSON.jsonObjects.InitializationOfJSONObjects;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CreateJSONObject {

    public InitializationOfJSONObjects createObjects() {
        Gson gson = new Gson();
        InitializationOfJSONObjects initializationOfJSONObjects = null;
        {
            try {
                initializationOfJSONObjects = gson.fromJson(new FileReader("/home/vadim/Загрузки/jsonTask.json"), InitializationOfJSONObjects.class);

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return initializationOfJSONObjects;
    }
}
