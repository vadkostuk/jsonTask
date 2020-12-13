package parserGSON.jsonObjects;

public class DeviceManufacturers {
    private String correctData;
    private String typeOfReportableEvent;

    public String getCorrectData() {
        return correctData;
    }

    public String getTypeOfReportableEvent() {
        return typeOfReportableEvent;
    }

    @Override
    public String toString(){
        return "Correct Data:"+correctData+"\nType Of Reportable Event:"+typeOfReportableEvent;
    }
}
