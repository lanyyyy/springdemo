package com.lanyyyy.springdemo.controllers;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.test.context.ContextConfiguration;

@ConfigurationProperties(prefix = "mail", ignoreUnknownFields = true)
public class MailProperties {
    public static class Smtp {
        private boolean auth;
        private boolean starttlsEnable;
        // ... getters and setters
    }

    private String host;
    private int port;
    private String from;
    private String username;
    private String password;
    private Smtp smtp;
    // ... getters and setters
}
