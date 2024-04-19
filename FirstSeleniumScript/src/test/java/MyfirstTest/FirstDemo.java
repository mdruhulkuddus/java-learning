package MyfirstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstDemo {
    public static void main(String[] args) throws InterruptedException {
//        //chrome
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        // firefox
//        System.setProperty("webdriver.gecko.driver", "F:\\JavaLearning\\FirstSeleniumScript\\Drivers\\geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();
//        driver.get("https://opensource-demo.orangehrmlive.com/");
//
        // edge
//        System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"//Drivers//msedgedriver.exe");
//        WebDriver driver = new EdgeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(3000);
//        driver.close();
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");

//        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

        driver.findElement(By.xpath("//p[@class=\"oxd-text oxd-text--p orangehrm-login-forgot-header\"]")).click();
    }
}
