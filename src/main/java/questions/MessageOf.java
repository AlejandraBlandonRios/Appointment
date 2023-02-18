package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterface.AppointmentPageUserInterface.CONFIRMATION_MESSAGE;

public class MessageOf implements Question<String> {
    public static MessageOf booking() {
        return new MessageOf();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(CONFIRMATION_MESSAGE).viewedBy(actor).asString();
    }
}
