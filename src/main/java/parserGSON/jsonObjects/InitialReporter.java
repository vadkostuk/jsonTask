package parserGSON.jsonObjects;

public class InitialReporter {
    private String firstName;
    private String initialReporter;
    private String phone;

    public String getFirstName() {
        return firstName;
    }

    public String getInitialReporter() {
        return initialReporter;
    }

    public String getPhone() {
        return phone;
    }
    @Override
    public String toString(){
        return "First Name:"+firstName+"\nInitial Reporter:"+initialReporter+"\nPhone:"+phone;
    }
}
