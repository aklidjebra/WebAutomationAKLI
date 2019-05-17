package regressionTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.CostcoClass2;

public class CostcoTestclass2 extends CommonAPI {
    CostcoClass2 cosclass2 ;
    String url="https://www.costco.com/";

    @BeforeClass
    public void init (){
        cosclass2 = PageFactory.initElements(driver, CostcoClass2.class);
        driver.get(url);
    }
    @AfterMethod
    public void openpage  () {
   driver.get(url);
    }
    @Test
    public void setphar (){
        cosclass2.setPharmacy();

    }
}
