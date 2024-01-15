package com.example.demo.dip;
//https://dzen.ru/a/ZRU4kWyjgkMj406C
public class MyApp {
    public static void main(String[] args) {
        MessageSender messageSender = new EmailMessageSender();
        NotificationService notificationService = new NotificationService(messageSender);
        notificationService.sendNotification("Hello World!");
    }
}
