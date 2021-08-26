package technical.challenge.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import technical.challenge.userinterfaces.UtestPassword;

public class Password implements Task {

    private String strPassword;

    public Password(String strPassword) {

        this.strPassword = strPassword;
    }

    public static Password Pass(String strPassword){
        return Tasks.instrumented(Password.class, strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strPassword).into(UtestPassword.PASSWORD),
                Enter.theValue(strPassword).into(UtestPassword.R_PASSWORD),
                Click.on(UtestPassword.TERMS_1),
                Click.on(UtestPassword.TERMS_2)
//              Se comenta el código que ejecuta la creación de la cuenta debido al captcha que impide al creación
//              Click.on(UtestPassword.FINISH)
                );
        }
    }
