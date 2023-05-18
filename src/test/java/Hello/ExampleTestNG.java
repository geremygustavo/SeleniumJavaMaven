package Hello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExampleTestNG {
    private WebDriver driver;

    @BeforeSuite
    public void initDriver() throws Exception {
        System.out.println("You are testing in Chrome");
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();

    }

    @Test
    public void searchTestNGInGoogle() throws InterruptedException {

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://trello.com/login");

        WebElement userTextArea = driver.findElement(By.id("user"));
        userTextArea.sendKeys("Abel.Mallcu@jalasoft.com");

        WebElement loginBtn = driver.findElement(By.id("login"));
        loginBtn.click();

        WebElement passwordTextArea = driver.findElement(By.name("password"));
        passwordTextArea.sendKeys("010492EM7@dmin2023");

        WebElement submintBtn = driver.findElement(By.xpath("//button[@id='login-submit']/span"));
        submintBtn.click();

        Thread.sleep(5000);

    }

    @AfterSuite
    public void quitDriver() throws Exception {
//        driver.quit();
    }
}