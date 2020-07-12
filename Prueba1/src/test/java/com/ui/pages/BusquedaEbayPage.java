package com.ui.pages;

import com.ui.driver.BaseDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class BusquedaEbayPage extends BaseDriver {

    public BusquedaEbayPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@id='gh-ac']")
    private WebElement campoBusqueda;

    @FindBy(id = "gh-btn")
    private WebElement botonBusqueda;

    @FindBy(xpath = "//div[@id='x-refine__group_1__0']//span[text()='9']")
    private  WebElement checkboxTalla;

    public void go_url(String url) {
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Long.parseLong(String.valueOf(40)), TimeUnit.SECONDS);//wait implicito

        driver.get(url);
    }

    public void buscarProducto(String producto) {

        campoBusqueda.sendKeys(producto);
        botonBusqueda.click();
    }

    public void elegirTalla() throws InterruptedException{
        //sleep(5000);
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(checkboxTalla));//wait explicito


        checkboxTalla.click();

    }
}
