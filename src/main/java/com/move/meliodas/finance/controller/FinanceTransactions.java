package com.move.meliodas.finance.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class FinanceTransactions {

    @GetMapping
    public ResponseEntity<String> ok(Principal principal) {
        return ResponseEntity.ok("Ok");
    }

    @GetMapping("/uwu")
    public ResponseEntity<String> roles() {
        return ResponseEntity.ok("OwO");
    }
}
