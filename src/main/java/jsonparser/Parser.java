package jsonparser;
import com.google.gson.Gson;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.*;

public class Parser {

    public static void main(String[] args) {
         parseAll(createJSONObject());

    }


    private static JSONObject createJSONObject(){
        try {
            return (JSONObject) new JSONParser().parse(new FileReader("/home/vadim/Загрузки/jsonTask.json"));
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void parserChildCompany(JSONObject jo, String companyName){
    JSONObject childCompanies=  (JSONObject) ((JSONObject) jo.get("manufacturers")).get("childCompanies");
    JSONObject company = (JSONObject)childCompanies.get(companyName);
    System.out.println(formatString(company.toString()));
}

    public static String formatString(String str){
        return str.replaceAll("[{}\"]","").replaceAll(",","\n");
    }

    public static void parseAll(JSONObject jsonObject){
        System.out.println(formatString(jsonObject.toString()));
    }

    public static void parserGeneral(JSONObject jo){
        JSONObject general = (JSONObject) jo.get("general");
        System.out.println("General:\n"+formatString(general.toString()));
    }

    public static void parserDevice(JSONObject jo){
        JSONObject device = (JSONObject) jo.get("device");
        System.out.println("\nDevice:\n"+formatString(device.toString()));
    }

    public static void parserInitialReporter(JSONObject jo){
        JSONObject initialReporter = (JSONObject) jo.get("initialReporter");
        System.out.println("\nInitialReporter:\n"+formatString(initialReporter.toString()));
    }

    public static void parserManufacturers(JSONObject jo){
        JSONObject manufacturers = (JSONObject) jo.get("manufacturers");
        System.out.println("\nManufacturers:\n"+formatString(manufacturers.toString()));
    }

    public static void parseDeviceManufacturers(JSONObject jo){
        JSONObject deviceManufacturers = (JSONObject) jo.get("deviceManufacturers");
        System.out.println("\nDeviceManufacturers:\n"+formatString(deviceManufacturers.toString()));
    }
}











