//import org.junit.Test;
import javafx.scene.layout.Priority;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestNGTest {
    @BeforeSuite
    public void test5Method(){
        System.out.println("The annotated method will be run only " +
                "once before all tests in this suite have run. ");}
     @AfterSuite
     public void test6Method(){
         System.out.println("The annotated method will be run only " +
                 "once after all tests in this suite have run. ");}
    @BeforeClass
        public void test1Method(){
        System.out.println("The annotated method will be run only once before the " +
                "first test method in the current class is invoked. ");
    }
    @AfterClass
    public void test2Method(){
        System.out.println("The annotated method will be run only once after" +
                " all the test methods in the current class have run. ");
    }

    @BeforeMethod
    public void test3Method(){
        System.out.println("The annotated method will be run before each test method. ");
    }

    @AfterMethod
    public void test4Method(){
        System.out.println("The annotated method will be run after each test method. ");
    }
    @Test(priority=1)
    public void bothempty(){
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\crome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Keep both fields empty");
        driver.navigate().to("https://egig2go.com/egig_qa/login");
        driver.findElement(By.name("username")).sendKeys("");
        driver.findElement(By.name("password")).sendKeys("");
        driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/div[4]/button")).click();
        driver.close();
    }
    @Test(priority = 2)
    public void vaidUsername(){
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\crome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Keeps only valid username & empty password");
        driver.navigate().to("https://egig2go.com/egig_qa/login");
        driver.findElement(By.name("username")).sendKeys("dilshan");
        driver.findElement(By.name("password")).sendKeys("");
        driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/div[4]/button")).click();
        driver.close();

    }
//    @Test(priority = 3)
//    public void vaildPassword(){
//        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\crome\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        System.out.println("Keeps only valid password & username empty");
//        driver.navigate().to("https://egig2go.com/egig_qa/login");
//        driver.findElement(By.name("username")).sendKeys("");
//        driver.findElement(By.name("password")).sendKeys("secret");
//        driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/div[4]/button")).click();
//        driver.close();
//    }
//    @Test(priority = 4)
//    public void bothInvalid(){
//        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\crome\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        System.out.println("Keeps both invalid username & password");
//        driver.navigate().to("https://egig2go.com/egig_qa/login");
//        driver.findElement(By.name("username")).sendKeys("dil");
//        driver.findElement(By.name("password")).sendKeys("secre");
//        driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/div[4]/button")).click();
//        driver.close();
//    }
//    @Test(priority = 5)
//    public void bothValid(){
//        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\crome\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        System.out.println("Enter valid username, password, clicks on login");
//        driver.navigate().to("https://egig2go.com/egig_qa/login");
//        driver.findElement(By.name("username")).sendKeys("dilshan");
//        driver.findElement(By.name("password")).sendKeys("secret");
//        driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/div[4]/button")).click();
//        driver.close();
  //  }


}
