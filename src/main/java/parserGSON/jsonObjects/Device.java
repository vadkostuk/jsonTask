package parserGSON.jsonObjects;

public class Device {
    private String brandName;
    private String code;

    public String getBrandName() {
        return brandName;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString(){
        return "Brand Name:"+brandName+"\nCode:"+code;
    }
}
