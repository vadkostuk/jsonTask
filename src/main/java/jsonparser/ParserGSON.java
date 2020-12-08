package jsonparser;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ParserGSON {
    public static void parser() throws FileNotFoundException {
        Gson gson = new Gson();
        Companies companies = gson.fromJson(new FileReader("/home/vadim/Загрузки/jsonTask.json"), Companies.class);

        System.out.println(companies.device.brandName);
    }

    public static void main(String[] args) throws FileNotFoundException {
        parser();
    }
}

class Companies{
    public General general;
    public Device device;
    public InitialReporter initialReporter;
    public Manufacturers manufacturers;
    public DeviceManufactures deviceManufacturers;
}
class General{
    public String classification;
}
class Device{
    public String brandName;
    public String code;
}
class InitialReporter{
    public String firstName;
    public String initialReporter;
    public String phone;
}
class Manufacturers{
    public String siteAddress;
    public String siteRegionState;
    public String reportSource;
    public String officePhoneNumber;
    public String siteName;
    public ChildCompanies childCompanies;
}


class ChildCompanies{
    public String address;
    public String state;
    public String phone;
}

class DeviceManufactures{
    public String typeOfReportableEvent;
    public String correctedData;
}