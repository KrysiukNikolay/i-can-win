import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class PastebinTest {
    @Test
    public void pastebinOpen() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://pastebin.com");
        driver.findElement(By.xpath("//*[@id='postform-text']")).sendKeys("Hello from WebDriver");

        driver.findElement(By.xpath("//*[@id=\"w0\"]/div[5]/div[1]/div[4]/div/span/span[1]/span/span[2]")).click();
        driver.findElement(By.xpath("//li[text()='10 Minutes']")).click();

        driver.findElement(By.xpath("//*[@id=\"postform-name\"]")).sendKeys("helloweb");

        driver.findElement(By.xpath("//button[text()='Create New Paste']")).click();
        Thread.sleep(3000);

        driver.quit();
    }
}
