package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    @FindBy(className = "title")
    WebElement productTitle;

    public DashboardPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void verifyLoginRedirectsToDashboardPage() {
        Assert.assertEquals(productTitle.getText(), "Products");
    }
}
