package com.example.demo_hephantan_service2.Service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductServiceImpl implements ProductService {
    RestTemplate restTemplate = new RestTemplate();
    String urlDatabaseService = "http://localhost:9000/hpt/db-service";
    @Override
    public String getAllProduct(){
        String url = urlDatabaseService + "/products";
        HttpHeaders httpHeaders = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(httpHeaders);
        ResponseEntity<String> svResponse = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        return svResponse.getBody();
    }
}
