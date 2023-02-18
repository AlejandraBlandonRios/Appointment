package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://katalon-demo-cura.herokuapp.com/")
public class AppointmentPageUserInterface extends PageObject {
    public static final Target MAKE_APPOINTMENT_BUTTON = Target.the("Make appointment button").
            located(By.id("btn-make-appointment"));
    public static final Target USERNAME_INPUT = Target.the("Username input").
            located(By.id("txt-username"));
    public static final Target PASSWORD_INPUT = Target.the("Password input").
            located(By.id("txt-password"));
    public static final Target LOGIN_BUTTON = Target.the("Login button").
            located(By.id("btn-login"));
    public static final Target APPLY_CHECKPOINT = Target.the("Apply checkpoint").
            located(By.id("chk_hospotal_readmission"));
    public static final Target VISIT_DATE_FIELD = Target.the("Visit date field").
            located(By.id("txt_visit_date"));
    public static final Target COMMENT_FIELD = Target.the("Comment field").
            located(By.id("txt_comment"));
    public static final Target BOOK_BUTTON = Target.the("Book Appointment button").
            located(By.id("btn-book-appointment"));
    public static final Target CONFIRMATION_MESSAGE = Target.the("Appointment confirmation button").
            located(By.xpath("//h2[contains(text(),'Appointment Confirmation')]"));
}
