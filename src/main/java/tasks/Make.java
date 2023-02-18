package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterface.AppointmentPageUserInterface.*;

public class Make implements Task {
    public static Make anAppointment() {
        return Tasks.instrumented(Make.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(APPLY_CHECKPOINT),
                Enter.theValue("15/02/2023").into(VISIT_DATE_FIELD),
                Enter.theValue("My comment").into(COMMENT_FIELD),
                Click.on(BOOK_BUTTON));
    }
}
