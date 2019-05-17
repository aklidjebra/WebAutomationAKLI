package regression;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CostcoClass1 extends CommonAPI {

    public void openPage (){
        System.out.println(driver.getTitle());

    }
    public void search (String item) {
        driver.findElement(By.id("search-field")).sendKeys(item);
    }
    public void click (){
        driver.findElement(By.id("search-field")).click();

    }
    public void storby (){
        driver.findElement(By.xpath("//*[@id=\"accordion-filter_collapse-2\"]/div/a[2]/label/span[1]")).click();

        //Select select = new Select(driver.findElement(By.id("sort_by")));
       // select.selectByIndex(1);
    }






}
