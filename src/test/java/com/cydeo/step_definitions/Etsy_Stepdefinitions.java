package com.cydeo.step_definitions;

import com.cydeo.pages.DropdownsPage;
import com.cydeo.utilities.BrowserUtilities;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
public class Etsy_Stepdefinitions {

// i love java

    WebDriver driver = new ChromeDriver();
    @When("User open the chrome browser")
    public void user_open_the_chrome_browser() {


        driver.manage().window().maximize();




    }

    @And("User go to Etsy page")
    public void userGoToEtsyPage() {
        driver.get("https://www.etsy.com");

    }

    @Then("User click accept button")
    public void userClickAcceptButton() {
        driver.findElement(By.xpath("//*[@class='wt-btn wt-btn--filled wt-mb-xs-0']")).click();
    }

    @And("User enter {string}")
    public void userEnter(String arg0) {
        driver.findElement(By.xpath("//*[@id='global-enhancements-search-query']")).sendKeys(arg0);
        
    }

    @Then("User click the  search")
    public void userClickTheSearch() {
        driver.findElement(By.xpath("//*[@class='wt-icon wt-nudge-b-2 wt-nudge-r-1']")).click();
        
    }

    @Then("User can see {string} title")
    public void userCanSeeTitle(String actualResult) {
        String expectedResult=driver.getTitle();
       Assert.assertEquals(expectedResult,actualResult);
    }
}
