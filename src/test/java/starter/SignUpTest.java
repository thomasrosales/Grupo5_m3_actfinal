package starter;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import static org.junit.Assert.assertNotNull;

public class SignUpTest {

    private static final String LOCAL_PATH_TO_CHROME_EXECUTABLE_DRIVER = "F:\\___MIRH\\Tools\\Selenium\\chrome-driver\\chromedriver.95.0.4638.69.exe";

    private static ChromeDriverService service;
    private WebDriver driver;

    @BeforeClass
    public static void createAndStartService() throws IOException {

        service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File(LOCAL_PATH_TO_CHROME_EXECUTABLE_DRIVER))
                .usingAnyFreePort()
                .build();

        service.start();
    }

    @Before
    public void createDriver() {

        driver = new RemoteWebDriver(service.getUrl(), new ChromeOptions());
    }

    @After
    public void quitDriver() {

        driver.quit();
    }

    @Test
    public void testGoogleSearch() {

        driver.manage().window().maximize();
        System.out.println("Entrando a la tienda. Página principal");
        driver.get("https://www.demoblaze.com/index.html");

        WebElement signUpLink = driver.findElement(By.xpath("//html/body/nav/div[1]/ul/li[8]/a"));
        signUpLink.click();
        System.out.println("Click en Sign Up Link.");

        WebElement userText = driver.findElement(By.id("sign-username"));
        userText.sendKeys(UUID.randomUUID().toString());
        WebElement userPass = driver.findElement(By.id("sign-password"));
        userPass.sendKeys("user-pass");

        WebElement signUpButton = driver.findElement(By.xpath("//html/body/div[2]/div/div/div[3]/button[2]"));
        signUpButton.click();

        assertNotNull( driver.switchTo().alert().getText() );
    }

}
