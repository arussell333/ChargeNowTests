package com.example.adamrussell.chargenowtests;

import org.junit.Test;

import static org.junit.Assert.*;



/**
 * Created by adamrussell on 03/05/16.
 */

import io.appium.java_client.android.AndroidDriver;
import java.net.URL;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.concurrent.TimeUnit;



public class   ExampleUnitTest {

    private AndroidDriver driver;

    @Before
    public void testCaseSetupEM() throws Exception {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("automationName", "appium");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("plafformVersion", "5.1.1");
        capabilities.setCapability("app", ("/Users/adamrussell/Downloads/ChargeNow_v1.1.1.apk"));
        capabilities.setCapability("appPackage", "com.bmw.chargenow");
        //capabilities.setCapability("noReset", "true");
        capabilities.setCapability("appActivity", "ui.activity.SplashActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


    }


    @Test

    public void testCaseLogin() throws Exception

    {




    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}



