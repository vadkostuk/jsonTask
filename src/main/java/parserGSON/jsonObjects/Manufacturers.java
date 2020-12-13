package parserGSON.jsonObjects;

import parserGSON.jsonObjects.ChildCompanies;

public class Manufacturers {
    private String siteAddress;
    private String siteRegionState;
    private String reportSource;
    private String officePhoneNumber;
    private String siteName;
    private ChildCompanies childCompanies;

    public String getSiteAddress() {
        return siteAddress;
    }

    public String getSiteRegionState() {
        return siteRegionState;
    }

    public String getReportSource() {
        return reportSource;
    }

    public String getOfficePhoneNumber() {
        return officePhoneNumber;
    }

    public String getSiteName() {
        return siteName;
    }

    public ChildCompanies getChildCompanies() {
        return childCompanies;
    }

    @Override
    public String toString(){
        return "Site Address:"+siteAddress+"\nSite Region State:"+siteRegionState+"\nReport Source:"+reportSource
                +"\nOfficePhoneNumber:"+officePhoneNumber+"\nSite Name:"+siteName +"\nChild Companies: "+childCompanies.toString();
    }
}
