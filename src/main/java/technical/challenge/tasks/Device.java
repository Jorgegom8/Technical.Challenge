package technical.challenge.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import technical.challenge.userinterfaces.UtestDevice;

public class Device implements Task {

    private String strDevice;
    private String strModel;

    public Device(String strDevice, String strModel) {

        this.strDevice = strDevice;
        this.strModel = strModel;
    }

    public static Device module(String strDevice, String strModel){

        return Tasks.instrumented(Device.class, strDevice, strModel );

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestDevice.LIST_M_DEVICE),
                Enter.theValue(strDevice).into(UtestDevice.INPUT_M_DEVICE),
                Hit.the(Keys.ENTER).keyIn(UtestDevice.INPUT_M_DEVICE),
                Click.on(UtestDevice.LIST_MODEL),
                Enter.theValue(strModel).into(UtestDevice.INPUT_MODEL),
                Click.on(UtestDevice.MODEL),
                Click.on(UtestDevice.LIST_M_OS),
                Click.on(UtestDevice.M_OS),
                Click.on(UtestDevice.BUTTON_LS)
                );
    }
}
