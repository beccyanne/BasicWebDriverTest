import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

/**
 * Created by beccy on 13/06/2017.
 */
public class TestGoogle {
    public static void main(String[] args) throws Exception {


        WebDriver driver = new ChromeDriver();


        driver.get("https://google.com");
        System.out.println("Title of page is: " + driver.getTitle());

        driver.quit();
    }

}
