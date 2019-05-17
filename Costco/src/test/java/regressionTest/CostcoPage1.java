package regressionTest;

import org.testng.annotations.Test;
import regression.CostcoClass1;

public class CostcoPage1 extends CostcoClass1 {



    @Test
    public void testMethods() throws InterruptedException {
        openPage();
        Thread.sleep(2000);
        search("iphoneXR");
        Thread.sleep(2000);
        click();
        Thread.sleep(2000);
        storby();
        Thread.sleep(2000);




    }

}
