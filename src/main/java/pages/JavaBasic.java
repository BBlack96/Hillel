package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaBasic {
    private WebDriver driver;

    public JavaBasic(WebDriver driver) {
        this.driver = driver;
        driver.get("https://ithillel.ua/courses/java-basic");
    }

    public void getCourseTitle() {
        System.out.println(driver.getTitle());

    }

    public void getCourseRate() {
        System.out.println(driver.findElement(By.className("course-rating_average")).getText());
    }

    public void getCourseDescription() {
        System.out.println(driver.findElement(By.className("introduction_main")).getText());


    }


}
