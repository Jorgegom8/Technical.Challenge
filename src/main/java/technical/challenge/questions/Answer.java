package technical.challenge.questions;


import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import technical.challenge.userinterfaces.UtestPassword;


public class Answer {

    public static Question<String> answer(){
        return actor -> TextContent.of(UtestPassword.FINISH).viewedBy(actor).asString();
    }
}
