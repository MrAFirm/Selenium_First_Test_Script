package org.example.Action;

import org.example.Utils.StaticDatas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import static org.testng.Assert.assertEquals;

public class ActionsToPerform
{
    public static WebDriver driver;
    public void launchBrowser()
    {
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public void open()
    {
        driver.get(StaticDatas.URLToOpen);
    }

    public void click()
    {
        WebElement radioBtn = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[1]/input"));
        radioBtn.click();
    }
    public void verifyText()
    {
        WebElement chkMessage = driver.findElement(By.xpath("//*[@id='check']"));
        String  text = chkMessage.getText();
        System.out.println("Message is: " + text);

        assertEquals(text, "You have checked Yes");
    }
    public void quit()
    {
        driver.quit();
    }
}
