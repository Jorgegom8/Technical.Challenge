package technical.challenge.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestPassword {
    public static final Target PASSWORD = Target.the("Input for the password")
            .located(By.xpath("//*[@id=\"password\"]"));
    public static final Target R_PASSWORD = Target.the("Input for the confirmation of password")
            .located(By.xpath("//*[@id=\"confirmPassword\"]"));
    public static final Target TERMS_1 = Target.the("Checkbox 1")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target TERMS_2 = Target.the("Checkbox 2")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target FINISH = Target.the("Button to finish the form")
            .located(By.xpath("//*[@id=\"laddaBtn\"]"));
    }
