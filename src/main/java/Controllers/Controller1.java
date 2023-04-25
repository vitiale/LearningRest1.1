package Controllers;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Controller1 {

    public boolean criteria = true;

    public void testR(){


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/users"))
                .GET()
                .build();
        try{
            final HttpResponse<String> response =client.send(request, HttpResponse.BodyHandlers.ofString());
            //System.out.println(response.body());
            JSONArray jsonArray = new JSONArray(response.body());
            JSONObject jsonObject = jsonArray.getJSONObject(1);
            System.out.println(jsonObject.get("name"));
        } catch(IOException | InterruptedException e ){
            e.printStackTrace();
        }finally {
            System.out.println("-------------------");
        }
    }

    public double divN(int x, int y){
        return x/y;
    }



}
