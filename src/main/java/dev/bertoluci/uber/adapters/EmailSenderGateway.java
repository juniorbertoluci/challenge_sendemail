package dev.bertoluci.uber.adapters;

public interface EmailSenderGateway {
    void sendEmail(String to, String subject, String body);
}
