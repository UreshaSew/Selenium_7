import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonCheckBox {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\crome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/radio.html");
        WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
        WebElement radio3 = driver.findElement(By.id("vfb-7-3"));

        WebElement checkbox1 = driver.findElement(By.id("vfb-6-0"));
        WebElement checkbox2 = driver.findElement(By.id("vfb-6-1"));
        WebElement checkbox3 = driver.findElement(By.id("vfb-6-2"));

        radio1.click();
        System.out.println("radio1 is selected");

        radio2.click();
        System.out.println("radio2 is selected ");// radio1 is  deselected & radio 2 is selected

        checkbox1.click();  // This will Toggle the Check box
        System.out.println("Checkbox 2 is selected");

        // check whether radio buttobn 1 is togggle on
        if(radio1.isSelected()) {
            System.out.println("Radio button1 is toggle on");
        }else{
            System.out.println("Radio button1 is toggle off");
        }
        // check whether checkbox1 is togggle on
        if(checkbox1.isSelected()){
            System.out.println("Checkbox1 is toggle on");
        }else{
            System.out.println("Radio2 is toggle on");
        }

        // toggle off the checkbox1
        checkbox1.click();
        if(!checkbox1.isSelected()){
            System.out.println("checkbox1 is toggle off");
        }
    }
}
