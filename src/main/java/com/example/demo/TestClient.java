package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "test", url = "http://localhost:8080")
public interface TestClient {

    @GetMapping(value = "/test", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_OCTET_STREAM_VALUE})
    public ResponseEntity<String> test();

    @GetMapping(value = "/test2", produces = {MediaType.APPLICATION_OCTET_STREAM_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> test2();

    @GetMapping(value = "/test3", produces = MediaType.APPLICATION_JSON_VALUE + ", " + MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public ResponseEntity<String> test3();

}
