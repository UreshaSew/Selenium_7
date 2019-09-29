import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



    public class Submit {
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "C:\\selenium\\crome\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            String baseurl = "http://demo.guru99.com/test/login.html";
            driver.get(baseurl);
            WebElement email = driver.findElement(By.id("email"));
            WebElement password = driver.findElement(By.id("passwd"));

            email.sendKeys("abcd@gmail.com");
            password.sendKeys("abcdefghlkjl");
            System.out.println("Text field set");
            // Deleting values in the text box
            email.clear();
            password.clear();
            System.out.println("Text fields are cleared");

            WebElement login = driver.findElement(By.id("SubmitLogin"));
            // Using click method to submit form
            email.sendKeys("abcd@gmail.com");
            password.sendKeys("abcdefghlkjl");
            login.click();
            System.out.println("Login done with click");

            //using submit method to submit the form. Submit used on password field
            driver.navigate().to(baseurl); // 1 method
            driver.get(baseurl);           // 2 method
            driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
            driver.findElement(By.id("passwd")).sendKeys("abcdefghlkjl");
            driver.findElement(By.id("SubmitLogin")).click();

            email.submit();
            password.submit();


        }
    }

