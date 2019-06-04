package lol;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * @author krzysztof.niedzielski
 */
public class App {

    public static void main(String[] args) {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create("http://localhost:8081/test")).build();
        HttpResponse.BodyHandler<String> asString = HttpResponse.BodyHandlers.ofString();

        try {
            HttpResponse<String> httpResponse = httpClient.send(httpRequest,asString);
            System.out.println(httpResponse.body());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
