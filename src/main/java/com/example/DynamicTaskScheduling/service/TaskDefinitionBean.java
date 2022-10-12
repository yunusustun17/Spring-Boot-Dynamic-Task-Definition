package com.example.DynamicTaskScheduling.service;

import com.example.DynamicTaskScheduling.tdo.TaskDefinition;
import org.springframework.stereotype.Service;

@Service
public class TaskDefinitionBean implements Runnable {

    private TaskDefinition taskDefinition;

    @Override
    public void run() {
        System.out.println("Running action: " + taskDefinition.getActionType());
        System.out.println("With Data: " + taskDefinition.getData());
    }

    public TaskDefinition getTaskDefinition() {
        return taskDefinition;
    }

    public void setTaskDefinition(TaskDefinition taskDefinition) {
        this.taskDefinition = taskDefinition;
    }
}

