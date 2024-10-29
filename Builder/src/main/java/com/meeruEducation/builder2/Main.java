package com.meeruEducation.builder2;

public class Main {

    public static void main(String[] args) {

        // Basic GET request without additional options
        HttpRequest getRequest = new HttpRequest.Builder("https://api.example.com/resource", "GET").build();

        System.out.println(getRequest);

        // POST request with headers and a query parameter
        HttpRequest postRequest = new HttpRequest.Builder("https://api.example.com/resource", "POST")
                .setHeaders("Content-Type", "application/json")
                .setHeaders("Authorization", "Bearer token")
                .setQueryParams("lang", "en")
                .setTimeout(5000)
                .build();

        System.out.println(postRequest);

        HttpRequest customGetRequest = new HttpRequest.Builder("https://api.example.com/data", "GET")
                .setHeaders("Accept", "application/json")
                .setQueryParams("filter", "recent")
                .setTimeout(2000)
                .build();
        System.out.println(customGetRequest);

    }
}
