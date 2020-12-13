package parserGSON.jsonObjects;

public class ChildCompanies {
    private Amazon Amazon;
    private parserGSON.jsonObjects.Ebay Ebay;
    private parserGSON.jsonObjects.Google Google;

    public Amazon getAmazon() {
        return Amazon;
    }

    public Ebay getEbay() {
        return Ebay;
    }

    public Google getGoogle() {
        return Google;
    }

    @Override
    public String toString(){
        return Amazon.getClass().getSimpleName()+", "+Ebay.getClass().getSimpleName()+", "+Google.getClass().getSimpleName();
    }
}
