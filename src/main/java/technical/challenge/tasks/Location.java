package technical.challenge.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import technical.challenge.userinterfaces.UtestLocation;

public class Location implements Task {

    private String strCity;
    private String strZip;

    public Location(String strCity, String strZip) {

        this.strCity = strCity;
        this.strZip = strZip;
    }

    public static Location the(String strCity, String strZip){

        return Tasks.instrumented(Location.class, strCity, strZip);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strCity).into(UtestLocation.INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).keyIn(UtestLocation.INPUT_CITY),
                Hit.the(Keys.ENTER).keyIn(UtestLocation.INPUT_CITY),
                Enter.theValue(strZip).into(UtestLocation.INPUT_ZIP),
                Click.on(UtestLocation.DEVICE_BUTTON));
        }
    }
