package jsonParserTests;

import jsonparser.Parser;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import parserGSON.jsonObjects.InitializationOfJSONObjects;
import parserGSON.runner.CreateJSONObject;
import parserGSON.runner.VerifyObject;

public class childCompanyTests {

    @Test
    public void validCompany() {
        InitializationOfJSONObjects initialization = new CreateJSONObject().createObjects();
        Assert.assertTrue(new VerifyObject().isObjectExist(initialization.getManufacturers().getChildCompanies(),"Google"));
    }
    @Test
    public void inValidCompany() {
        InitializationOfJSONObjects initialization = new CreateJSONObject().createObjects();
        Assert.assertFalse(new VerifyObject().isObjectExist(initialization.getManufacturers().getChildCompanies(),"Facebook"));
    }
}
