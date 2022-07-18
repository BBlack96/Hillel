import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson13 {
    @Test
    public void Test (){
        WebDriver driver=new ChromeDriver();
        driver.get("https://online.ithillel.ua/courses/qa-automation");
        driver.findElement(By.id("btn-consultation-hero"));
    }
}
