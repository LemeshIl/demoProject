package com.example.demo.dip;

public class NotificationService {
    private MessageSender messageSender;
    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }
    public void sendNotification(String message) {
        messageSender.sendMessage(message);
    }

}
