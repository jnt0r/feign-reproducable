package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class DemoApplicationTests {

	@Autowired
	private TestClient client;

	@Test
	void test() {
		ResponseEntity<String> test = client.test();
		Assertions.assertEquals("application/json, application/octet-stream", test.getBody());
	}

	@Test
	void test2() {
		ResponseEntity<String> test = client.test2();
		Assertions.assertEquals("application/json, application/octet-stream", test.getBody());
	}

	@Test
	void test3() {
		ResponseEntity<String> test = client.test3();
		Assertions.assertEquals("application/json, application/octet-stream", test.getBody());
	}

}
