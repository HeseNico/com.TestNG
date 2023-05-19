package tests.day14_TestNGFW;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class C02_Ignore {

    /*
    @Ignore mutasyonu
    basina yazildigi testi Ignor edilmesini saglar
    yani yazdigimiz testi calistirmaz
     */

    @Test
    public void youtubeTest(){
        System.out.println("Youtube");

    }
    @Test(priority = 3)@Ignore
    public void wiseTest(){
        System.out.println("Wise Quarter");

    }
    @Test
    public void amazonTest(){ // priority yazilmazsa 0 degeri alir
        System.out.println("Amazon");

    }
}
