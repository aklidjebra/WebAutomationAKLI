package regression;

import base.CommonAPI;
import org.openqa.selenium.By;

public class CostcoClass1 extends CommonAPI {

    public void openPage() {
        System.out.println(driver.getTitle());

    }

    public void search(String item) {

        driver.findElement(By.id("search-field")).sendKeys(item);
    }

    public void click() {
        driver.findElement(By.id("search-field")).click();

    }

    /*public void storby (){
        driver.findElement(By.xpath("//*[@id=\"accordion-filter_collapse-2\"]/div/a[2]/label/span[1]")).click();

        Select select = new Select(driver.findElement(By.id("sort_by")));
        select.selectByValue("Price (Low to High)");
    }

     */
    public void addtocart() {
        driver.findElement(By.id("cart-d")).click();
    }

    public void change() {
        driver.findElement(By.id("delivery-postal-change")).click();

    }

    public void zipcod() {
        driver.findElement(By.id("footer-search-field")).sendKeys("11111");
    }


}
