package com.example.demo;

import jakarta.websocket.server.PathParam;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class TestController {

    @GetMapping(value = "/test", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_OCTET_STREAM_VALUE})
    public ResponseEntity<String> test(@RequestHeader("Accept") String accept) {
        return ResponseEntity.ok(accept);
    }

    @GetMapping(value = "/test2", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_OCTET_STREAM_VALUE})
    public ResponseEntity<String> test2(@RequestHeader("Accept") String accept) {
        return ResponseEntity.ok(accept);
    }

    @GetMapping(value = "/test3", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_OCTET_STREAM_VALUE})
    public ResponseEntity<String> test3(@RequestHeader("Accept") String accept) {
        return ResponseEntity.ok(accept);
    }
}
