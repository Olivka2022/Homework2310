import com.codeborne.selenide.Condition;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ApplicationTest {
    @Test
    public void ShouldOpenSite() {
        WebDriverManager.chromedriver().setup();
        open("https://next.privat24.ua/money-transfer/card");
//[@type='submit']
        $("[data-qa-node='numberdebitSource']").sendKeys( "4552331448138217");
        $("[data-qa-node='expiredebitSource']").sendKeys( "0524");
        $("[data-qa-node='cvvdebitSource']").sendKeys( "962");
        $("[data-qa-node='firstNamedebitSource']").sendKeys( "Otpravitel");
        $("[data-qa-node='lastNamedebitSource']").sendKeys( "Otpravlenko");
        $("[data-qa-node='numberreceiver']").sendKeys( "4004159115449003");
        $("[data-qa-node='firstNamereceiver']").sendKeys( "Poluchatel");
        $("[data-qa-node='lastNamereceiver']").sendKeys( "Poluchenko");
        $("[data-qa-node='amount']").sendKeys( "123");
        $("[data-qa-node='currency']").click();
        $("[title='USD']").click();
        $("[@type='submit']").click();
       // $("[data-qa-node='payer-card']").shouldHave("4552 3314 4813 8217");
        $("[data-qa-node='payer-card']").shouldBe(Condition.exactText("4552 3314 4813 8217"));
        $("[data-qa-node='payer-amount']").shouldBe(Condition.exactText("123 USD"));
        $("[data-qa-node='payer-currency']").shouldBe(Condition.exactText("5.41 USD"));

        $("[data-qa-node='receiver-name']").shouldBe(Condition.exactText("Poluchatel Poluchenko"));
        $("[data-qa-node='receiver-card']").shouldBe(Condition.exactText("4004 1591 1544 9003"));
        $("[data-qa-node='receiver-amount']").shouldBe(Condition.exactText("123 USD"));
        $("[data-qa-node='receiver-currency']").shouldBe(Condition.exactText("0 USD"));
        $("[data-qa-node='total']").shouldBe(Condition.exactText("128.41 USD"));

    }
}
