package lab.builder;

import java.util.ArrayList;
import java.util.List;

public class NotificationMessage {
    private String recipient;
    private String subject;
    private String body;
    private Priority priority;
    private List<String> attachments;

    private NotificationMessage(Builder builder) {
        this.recipient = builder.recipient;
        this.subject = builder.subject;
        this.body = builder.body;
        this.priority = builder.priority;
        this.attachments = builder.attachments;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getBody() {
        return body;
    }

    public Priority getPriority() {
        return priority;
    }

    public List<String> getAttachments() {
        return attachments;
    }

    public static class Builder {
        private String recipient;
        private String subject;
        private String body;
        private Priority priority = Priority.LOW;
        private List<String> attachments = new ArrayList<>();

        // Set recipient
        public Builder to(String recipient) {
            this.recipient = recipient;
            return this;
        }

        // Set subject
        public Builder subject(String subject) {
            this.subject = subject;
            return this;
        }

        // Set body
        public Builder body(String body) {
            this.body = body;
            return this;
        }

        // Set priority
        public Builder priority(Priority priority) {
            this.priority = priority;
            return this;
        }

        // Add attachment
        public Builder attach(String file) {
            attachments.add(file);
            return this;
        }

        public NotificationMessage build() {
            if (recipient == null || recipient.isEmpty()) {
                throw new IllegalStateException("Recipient cannot be empty");
            }

            if (body == null || body.isEmpty()) {
                throw new IllegalStateException("Body cannot be empty");
            }

            return new NotificationMessage(this);
        }
    }
}