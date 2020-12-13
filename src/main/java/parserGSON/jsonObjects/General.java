package parserGSON.jsonObjects;

public class General {
    private String classification;

    public String getClassification() {
        return classification;
    }
    @Override
    public String toString(){
        return "Classification:"+classification;
    }
}
