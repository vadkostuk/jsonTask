package jsonParserTests;

import jsonparser.Parser;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class childCompanyTests {

    @DataProvider(name = "validChildCompany")
    public static Object[][] validChildCompany(){
        return new Object[][]{
                {"Google", "address:Google Address\nphone:133756\nstate:FL"},
                {"Facebook","address:Facebook Address\nphone:245587\nstate:FL"}};
    }
    @Test(dataProvider = "validChildCompany")
    public void validCompany(String companyName, String expectedData) {
        Parser parser = new Parser();
        String actualData = parser.parserChildCompany(parser.createJSONObject(),companyName);
        Assert.assertEquals(actualData, expectedData);
    }
}
