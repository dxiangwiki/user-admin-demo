package com.example.useradmin.entity;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class User {
    private Integer id;
    private String username;
    private Integer age;
    private String phone;
    private LocalDateTime createTime;
}