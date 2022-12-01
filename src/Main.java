import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        // lay duong dan thu muc goc
//        String projectPath = System.getProperty("user.dir");
//
//        // tro duong dan den chrome driver
//        System.setProperty("webdriver.chrome.driver", projectPath + "/web_drivers/chromedriver.exe");
//
//        // khoi tao 1 doi tuong chrom driver
//        WebDriver driver = new ChromeDriver();
//
//        // dieu huong den google
//        driver.get("https://google.com");
//
//        // dung man hinh 5s
//        Thread.sleep(5000);
//
//        // quit browser
//        driver.quit();
// "user.dir" la pram mac dinh cua ham getProperty, vi du "OS" get OS
//        String projectPath = System.getProperty("user.dir");
//        System.setProperty("webdriver.gecko.driver", projectPath + "/web_drivers/geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();
//        driver.get("https://google.com");
//        Thread.sleep(5000);
//        driver.quit();

//        String projectPath = System.getProperty("user.dir");
//        System.setProperty("webdriver.edge.driver", projectPath + "/web_drivers/msedgedriver.exe");
//        WebDriver driver = new EdgeDriver();
//        driver.get("https://google.com");
//        Thread.sleep(5000);
//        driver.quit();

        //Opera
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.opera.driver", projectPath + "/web_drivers/operadriver.exe");
        WebDriver driver = new OperaDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.quit();
    }

}