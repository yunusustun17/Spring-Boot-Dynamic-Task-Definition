package com.example.DynamicTaskScheduling.tdo;

import lombok.Data;

@Data
public class TaskDefinition {

    private String cronExpression;
    private String actionType;
    private String data;
}

