package com.springboot.firstproject;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CheckHttpResponse {
    @LocalServerPort
    private int port;

    @Autowired
    TestRestTemplate testRestTemplate;

    @Test
    public void shouldPassIfStringMatches(){
        assertEquals("Hello World", testRestTemplate.getForObject("http://localhost:"+port+"/", String.class));
    }

}
