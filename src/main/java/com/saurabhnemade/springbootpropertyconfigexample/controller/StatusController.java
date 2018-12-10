package com.saurabhnemade.springbootpropertyconfigexample.controller;

import com.saurabhnemade.springbootpropertyconfigexample.ResponseObjects.Status;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
    @GetMapping("/status")
    public ResponseEntity getStatus() {
        Status responseStatus = new Status();
        responseStatus.setStatus("success");
        responseStatus.setMessage("Service is up and running.");
        return ResponseEntity.ok(responseStatus);
    }
}
