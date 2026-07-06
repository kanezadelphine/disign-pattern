package lab.builder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NotificationMessageTest {

    @Test
    void validMessage() {
        NotificationMessage msg = new NotificationMessage.Builder()
                .to("user@email.com")
                .subject("Hello")
                .body("Test message")
                .priority(Priority.HIGH)
                .attach("file.pdf")
                .build();

        assertEquals("user@email.com", msg.getRecipient());
    }

    @Test
    void emptyRecipient() {
        assertThrows(IllegalStateException.class, () -> {
            new NotificationMessage.Builder()
                    .body("Hello")
                    .build();
        });
    }

    @Test
    void emptyBody() {
        assertThrows(IllegalStateException.class, () -> {
            new NotificationMessage.Builder()
                    .to("abc@mail.com")
                    .build();
        });
    }
}