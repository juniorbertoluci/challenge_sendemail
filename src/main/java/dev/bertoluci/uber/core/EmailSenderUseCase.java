package dev.bertoluci.uber.core;

public interface EmailSenderUseCase {
    void sendEmail(String to, String subject, String body);
}
