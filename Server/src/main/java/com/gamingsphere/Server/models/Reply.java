package com.gamingsphere.Server.models;

import org.springframework.data.annotation.Id;

public class Reply {
    @Id
    private String id;
    private User user;
    private String description;
}
