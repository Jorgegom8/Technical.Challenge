package technical.challenge.tasks;

import technical.challenge.userinterfaces.UtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenPage implements Task {
    private UtestPage utestPage;

    public static OpenPage thePage() {

        return Tasks.instrumented(OpenPage.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor){

        actor.attemptsTo(Open.browserOn(utestPage));

        }

    }