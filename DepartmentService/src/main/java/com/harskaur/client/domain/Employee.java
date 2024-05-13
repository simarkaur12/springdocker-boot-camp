package com.harskaur.client.domain;

import lombok.Data;

@Data
public class Employee {
    private Long id;
    private String name;
    private Long departmentId;
}
