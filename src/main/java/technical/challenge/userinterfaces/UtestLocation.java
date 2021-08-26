package technical.challenge.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestLocation  {


    public static final Target INPUT_CITY = Target.the("Input for the city")
            .located(By.xpath("//*[@id=\"city\"]"));
    public static final Target INPUT_ZIP = Target.the("Input for thr zip code")
            .located(By.xpath("//*[@id=\"zip\"]"));
    public static final Target DEVICE_BUTTON = Target.the("Button to go to the Device module")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
}

