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

    public JSONObject createJSONObject(){
        try {
            return (JSONObject) new JSONParser().parse(new FileReader("/home/vadim/Загрузки/jsonTask.json"));
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public  String parserChildCompany(JSONObject jo, String companyName){
    JSONObject childCompanies=  (JSONObject) ((JSONObject) jo.get("manufacturers")).get("childCompanies");
    JSONObject company = (JSONObject)childCompanies.get(companyName);
    return formatString(company.toString());
}

    public static String formatString(String str){
        return str.replaceAll("[{}\"]","").replaceAll(",","\n");
    }

    public String parseAll(JSONObject jsonObject){
        return formatString(jsonObject.toString());
    }

    public String parserGeneral(JSONObject jo){
        JSONObject general = (JSONObject) jo.get("general");
        return "General:\n"+formatString(general.toString());
    }

    public String parserDevice(JSONObject jo){
        JSONObject device = (JSONObject) jo.get("device");
        return "\nDevice:\n"+formatString(device.toString());
    }

    public String parserInitialReporter(JSONObject jo){
        JSONObject initialReporter = (JSONObject) jo.get("initialReporter");
        return "\nInitialReporter:\n"+formatString(initialReporter.toString());
    }

    public String parserManufacturers(JSONObject jo){
        JSONObject manufacturers = (JSONObject) jo.get("manufacturers");
        return "\nManufacturers:\n"+formatString(manufacturers.toString());
    }

    public String parseDeviceManufacturers(JSONObject jo){
        JSONObject deviceManufacturers = (JSONObject) jo.get("deviceManufacturers");
        return "\nDeviceManufacturers:\n"+formatString(deviceManufacturers.toString());
    }
}











