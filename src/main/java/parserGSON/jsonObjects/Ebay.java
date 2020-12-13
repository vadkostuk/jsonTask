package parserGSON.jsonObjects;

public class Ebay {
    private String address;
    private String state;
    private String phone;

    public String getAddress() {
        return address;
    }

    public String getState() {
        return state;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString(){
        return "Address:"+address+"\nState:"+state+"\nPhone:"+phone;
    }
}
