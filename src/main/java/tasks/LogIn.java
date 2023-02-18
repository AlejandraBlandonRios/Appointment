package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterface.AppointmentPageUserInterface.*;

public class LogIn implements Task {
    public static LogIn page() {
        return Tasks.instrumented(LogIn.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MAKE_APPOINTMENT_BUTTON),
                Enter.theValue("John Doe").into(USERNAME_INPUT),
                Enter.theValue("ThisIsNotAPassword").into(PASSWORD_INPUT),
                Click.on(LOGIN_BUTTON));

    }
}
