package regression;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CostcoClass2 extends CommonAPI {


    @FindBy(id="Home_Ancillary_3")
     public static  WebElement Pharmacy;



    public  void setPharmacy(){
        Pharmacy.click();
    }



}
