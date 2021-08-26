package technical.challenge.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestLogin {
    public static final Target LOGIN_BUTTON  =Target.the("the button thats open the form window")
            .located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
    public static final Target INPUT_FNAME = Target.the("Input for the first name")
            .located(By.xpath("//*[@id=\"firstName\"]"));
    public static final Target INPUT_LNAME = Target.the("Input for the last name")
            .located(By.xpath("//*[@id=\"lastName\"]"));
    public static final Target INPUT_EMAIL = Target.the("Input for the email")
            .located(By.xpath("//*[@id=\"email\"]"));
    public static final Target LIST_MONTH = Target.the("list for select the month")
            .located(By.xpath("//*[@id=\"birthMonth\"]"));
    public static final Target MONTH = Target.the("for select the month")
            .located(By.xpath("//*[@id=\"birthMonth\"]/option[8]"));
    public static final Target LIST_DAY = Target.the("for select the month")
            .located(By.xpath("//*[@id=\"birthMonth\"]"));
    public static final Target DAY = Target.the("for select the month")
            .located(By.xpath("//*[@id=\"birthDay\"]/option[15]"));
    public static final Target LIST_YEAR = Target.the("for select the month")
            .located(By.xpath("//*[@id=\"birthYear\"]"));
    public static final Target YEAR = Target.the("for select the month")
            .located(By.xpath("//*[@id=\"birthYear\"]/option[5]"));
    public static final Target GO_LOCATION = Target.the("Button to go to Location module")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
}
