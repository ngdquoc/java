package day28;

import java.net.URI;
import java.net.http.HttpRequest;
import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://example.com/api/lessons/28"))
                .timeout(Duration.ofSeconds(5))
                .header("Accept", "application/json")
                .GET()
                .build();
        System.out.println(request.method() + " " + request.uri());
        System.out.println("JSON mẫu: {\"topic\":\"HTTP\"}");
    }
}
