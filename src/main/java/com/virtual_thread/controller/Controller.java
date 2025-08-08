package com.virtual_thread.controller;

import com.virtual_thread.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reports")
public class Controller {

    @Autowired
    TransferService transferService;

    @PostMapping("/{title}")
    public ResponseEntity<String> generateReport(@PathVariable String title) {
        transferService.getTransfer(title);
        return ResponseEntity.ok( "✅ report started for title: " + title);
    }
}
