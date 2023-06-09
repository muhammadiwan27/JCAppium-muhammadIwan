package com.juaracoding;

import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.MobileDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;


public class TestCatatanKeuangan {
    AndroidDriver<MobileElement> driver;

    @BeforeMethod
    public void setup() throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("deviceName", "Pixel 2 API 30");
        dc.setCapability("udid", "emulator-5554");
        dc.setCapability("platformName", "android");
        dc.setCapability("appPackage", "com.chad.financialrecord");
        dc.setCapability("appActivity", "com.rookie.catatankeuangan.feature.splash.SplashActivity");
        dc.setCapability("noReset", "true");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(url, dc);
    }


    @Test
    public void inputPengeluaran() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("com.chad.financialrecord:id/action_bar_root")));
        MobileElement tombolMenambahkan = driver.findElementById("com.chad.financialrecord:id/fabMenu");
        MobileElement tabPengeluaran = driver.findElementById("com.chad.financialrecord:id/btnExpense");
        MobileElement tanggal = driver.findElementById("com.chad.financialrecord:id/tvDate");
        MobileElement tanggalDipilih = driver.findElementByAccessibilityId("13 Juni 2023");
        MobileElement btnOkTgl = driver.findElementById("android:id/button1");
        MobileElement kategori = driver.findElementById("com.chad.financialrecord:id/ibEditCategory");
        MobileElement kategoriDipilih = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[8]/android.widget.LinearLayout/android.widget.TextView");
        MobileElement jumlah = driver.findElementById("com.chad.financialrecord:id/ibCalc");
        MobileElement clc3 = driver.findElementById("com.chad.financialrecord:id/calc_btn_33");
        MobileElement btnOkClc = driver.findElementById("com.chad.financialrecord:id/calc_btn_ok");
        MobileElement ket = driver.findElementById("com.chad.financialrecord:id/etNote");
        MobileElement btnSave = driver.findElementById("com.chad.financialrecord:id/btSave");

        tombolMenambahkan.click();
        tabPengeluaran.click();
        tanggal.click();
        tanggalDipilih.click();
        btnOkTgl.click();
        kategori.click();
        kategoriDipilih.click();
        jumlah.click();
        clc3.click();
        btnOkClc.click();
        ket.sendKeys("Makan Siang");
        btnSave.click();
    }

    @Test
    public void inputPemasukan() {
        MobileElement tombolPemasukan = driver.findElementById("com.chad.financialrecord:id/btnIncome");
        MobileElement tanggal = driver.findElementById("com.chad.financialrecord:id/btnIncome");
        MobileElement tanggalDipilih = driver.findElementByAccessibilityId("13 Juni 2023");
        MobileElement btnOkTgl = driver.findElementById("android:id/button1");
        MobileElement kategoriPemasukan = driver.findElementById("com.chad.financialrecord:id/spCategory");
        MobileElement kategoriPemasukanDipilih = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.TextView");
        MobileElement jumlah1 = driver.findElementById("com.chad.financialrecord:id/ibCalc");
        MobileElement clc3 = driver.findElementById("com.chad.financialrecord:id/calc_btn_33");
        MobileElement btnOkClc = driver.findElementById("com.chad.financialrecord:id/calc_btn_ok");
        MobileElement ket1 = driver.findElementById("com.chad.financialrecord:id/etNote");
        MobileElement btnSave1 = driver.findElementById("com.chad.financialrecord:id/btSave");

        tombolPemasukan.click();
        tanggal.click();
        tanggalDipilih.click();
        btnOkTgl.click();
        kategoriPemasukan.click();
        kategoriPemasukanDipilih.click();
        jumlah1.click();
        clc3.click();
        btnOkClc.click();
        ket1.sendKeys("Gajian");
        btnSave1.click();
    }

}
