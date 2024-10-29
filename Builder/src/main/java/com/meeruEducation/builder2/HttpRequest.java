package com.meeruEducation.builder2;

import java.util.HashMap;
import java.util.Map;

public class HttpRequest {

    //Required params
    private final String url;
    private final String method;

    //Optional Params
    private final Map<String, String> headers;
    private final Map<String, String> queryParams;
    private final int timeout;

    private HttpRequest(Builder builder) {
        this.url = builder.url;
        this.method = builder.method;
        this.headers = builder.headers;
        this.queryParams = builder.queryParams;
        this.timeout = builder.timeout;
    }

    @Override
    public String toString() {
        return "HttpRequest{" +
                "url='" + url + '\'' +
                ", method='" + method + '\'' +
                ", headers=" + headers +
                ", queryParams=" + queryParams +
                ", timeout=" + timeout +
                '}';
    }

    public static class Builder {
        private final String url;
        private final String method;

        private final Map<String, String> headers = new HashMap<>();
        private final Map<String, String> queryParams = new HashMap<>();
        private int timeout;

        public Builder(String url, String method) {
            this.url = url;
            this.method = method;
        }

        public Builder setHeaders(String key, String value) {
            this.headers.put(key, value);
            return this;
        }

        public Builder setQueryParams(String key, String value) {
            this.queryParams.put(key, value);
            return this;
        }

        public Builder setTimeout(int timeout) {
            this.timeout = timeout;
            return this;
        }

        public HttpRequest build() {
            return new HttpRequest(this);
        }

    }

}
