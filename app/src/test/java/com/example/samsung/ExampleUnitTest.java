package com.example.samsung;

import org.junit.Test;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.*;

public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
//        String url = "https://ajax.googleapis.com/ajax/" + "services/search/web?v=1.0&q={query}";
//        RestTemplate restTemplate = new RestTemplate();
//        restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
//        String result = restTemplate.getForObject(url, String.class, "Android");
//        System.out.println(result);
        assertEquals(4, 2 + 2);
//
//        String url = "http://localhost:8080/" + "scs/common/apiTest";
//        RestTemplate restTemplate = new RestTemplate();
//        restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
//        String result = restTemplate.postForObject(url,  null, String.class);
//        System.out.println(result);

    }
}