package technical.challenge.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import technical.challenge.userinterfaces.UtestLogin;


public class Login implements Task {

    private String strF_name;
    private String strL_name;
    private String strEmail;

    public Login(String strF_name, String strL_name, String strEmail) {
        this.strF_name = strF_name;
        this.strL_name = strL_name;
        this.strEmail = strEmail;
    }

    public static Login onThePage(String strF_name, String strL_name, String strEmail){
        return Tasks.instrumented(Login.class, strF_name, strL_name, strEmail);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestLogin.LOGIN_BUTTON),
                Enter.theValue(strF_name).into(UtestLogin.INPUT_FNAME),
                Enter.theValue(strL_name).into(UtestLogin.INPUT_LNAME),
                Enter.theValue(strEmail).into(UtestLogin.INPUT_EMAIL),
                Click.on(UtestLogin.LIST_MONTH),
                Click.on(UtestLogin.MONTH),
                Click.on(UtestLogin.LIST_DAY),
                Click.on(UtestLogin.DAY),
                Click.on(UtestLogin.LIST_YEAR),
                Click.on(UtestLogin.YEAR),
                Click.on(UtestLogin.GO_LOCATION));
        }
    }
