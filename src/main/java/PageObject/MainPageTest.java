package PageObject;
import com.BaseTest;
import static com.Locators.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPageTest extends BaseTest {

    public MainPageTest(WebDriver driver) {
        super(driver);

    }
        public void enterInTheLinkOuNomeDeUsuarioField (String text) throws InterruptedException {
            driver.findElement(NAME_FIELD).sendKeys(text);

    }


    public void enterInTheEmailField(String text) {
    driver.findElement(EMAIL_FIELD).sendKeys(text);
    }

    public boolean verifyThatErrorIsAppearedBelowEmailField() {
    return driver.findElement(ERROR).isDisplayed();
    }

    public void clickOnTheCONTINUARButton() {
    driver.findElement(CONTINUAR_BUTTON).click();
    }
}
