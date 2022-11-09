package helpDesk;

import core.BaseSeleniumTest;
import org.junit.Test;

public class HelpDeskTest extends BaseSeleniumTest {

    @Test
    public void checkTicket() {
        String title = "Administrator";
        String body = "Message to support";
        String email = "test@gmail.com";
        MainPage mainPage = new MainPage();
        mainPage.createTicket(title, body, email);
    }
}
