package com.saurabhnemade.springbootpropertyconfigexample.controller;

import com.saurabhnemade.springbootpropertyconfigexample.ResponseObjects.Status;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
    @Value("${main.property.value}")
    private String mainPropertyValue;

    @Value("${some.value.property}")
    private String anotherPropertyValue;

    @Value("${another.two.property}")
    private String anotherTwoPropertyValue;
    @GetMapping("/status")
    public ResponseEntity getStatus() {
        Status responseStatus = new Status();
        responseStatus.setStatus("success");
        responseStatus.setMessage("Service is up and running. Values are : " + this.mainPropertyValue + " : " + this.anotherPropertyValue + " : "  + this.anotherTwoPropertyValue);
        return ResponseEntity.ok(responseStatus);
    }
}
