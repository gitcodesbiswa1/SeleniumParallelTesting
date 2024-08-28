package parallel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
 
public class ParallelBrowsers {
String baseUrl = "https://www.seleniumhq.org";
WebDriver driver;
 
@Test
@Parameters("Browsers")
public void LaunchChromeBrowser(String BrowserName) {
  if (BrowserName.equalsIgnoreCase("Chrome")) {
   System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
   driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.get(baseUrl);
   System.out.println(driver.getTitle());
   driver.quit();
  } else if (BrowserName.equalsIgnoreCase("Firefox")) {
   System.setProperty("webdriver.gecko.driver", "./FirefoxDriverJars/geckodriver.exe");
   driver = new FirefoxDriver();
   driver.manage().window().maximize();
   driver.get(baseUrl);
   System.out.println(driver.getTitle());
   driver.quit();
  }
 
  else if (BrowserName.equalsIgnoreCase("Edge")) {
   System.setProperty("webdriver.edge.driver", "./EdgeBrowserJars/msedgedriver.exe");
   driver = new EdgeDriver();
   driver.manage().window().maximize();
   driver.get(baseUrl);
   System.out.println(driver.getTitle());
   driver.quit();
  }
}
}
