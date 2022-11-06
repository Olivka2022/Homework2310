import com.codeborne.selenide.Condition;
import org.junit.Test;
import pages.GaragePage;
import pages.HomePage;

public class PageObjectTest {

    @Test
    public void canLogin() {
        //Arrange
        HomePage homePage = new HomePage();

        //Act
        GaragePage garagePage = homePage.login("lunavitsa+2@gmail.com", "Qwertyu123");

        //Assert
        garagePage.notifications.shouldHaveText("You have been successfully logged in");
    }

    @Test
    public void canAddCar() {
        //Arrange
        HomePage homePage = new HomePage();
        GaragePage garagePage = homePage.login("lunavitsa+2@gmail.com", "Qwertyu123");

        //Act
        garagePage.addCar("BMW", "X5", 1.2)
                .addCar("BMW", "X5", 1.2)
                .addCar("BMW", "X5", 1.2);

        //Assert
        garagePage.notifications.shouldHaveText("Car added");
    }
    @Test
    public void canLogoutViaHeader(){
        HomePage homePage = new HomePage();
        GaragePage garagePage = homePage.logoutViaHeader();
    }
    @Test
    public void canLogoutViaSideMenu(){
        HomePage homePage=new HomePage();
        GaragePage garagePage= homePage.logoutViaSideMenu();
    }
}

