package com.example.DynamicTaskScheduling.controller;

import com.example.DynamicTaskScheduling.service.TaskDefinitionBean;
import com.example.DynamicTaskScheduling.service.TaskSchedulingService;
import com.example.DynamicTaskScheduling.tdo.TaskDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(path = "/schedule")
public class JobSchedulingController {

    @Autowired
    private TaskSchedulingService taskSchedulingService;

    @Autowired
    private TaskDefinitionBean taskDefinitionBean;

    @PostMapping(path = "/taskdef", consumes = "application/json", produces = "application/json")
    public void scheduleATask(@RequestBody TaskDefinition taskDefinition) {
        taskDefinitionBean.setTaskDefinition(taskDefinition);
        taskSchedulingService.scheduleATask(UUID.randomUUID().toString(), taskDefinitionBean, taskDefinition.getCronExpression());
    }

    @GetMapping(path = "/remove/{jobid}")
    public void removeJob(@PathVariable String jobid) {
        taskSchedulingService.removeScheduledTask(jobid);
    }
}

