package by.stormnet.automation.core.utils;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;

public class FrameWorkHttpClient {
    protected HttpClient httpClient = HttpClientBuilder.create().build();
    private HttpGet httpGet;
    private HttpPost httpPost;
    private HttpPut httpPut;
    private HttpDelete httpDelete;

    public FrameWorkHttpClient() {
    }

    public Response doGet(String url) {
        this.httpGet = new HttpGet(url);
        Response response = null;

        try {
            HttpResponse httpResponse = this.httpClient.execute(this.httpGet);
            response = new Response(httpResponse);
        } catch (IOException var4) {
            var4.printStackTrace();
        }

        return response;
    }

    public Response doPost(String url, String body) {
        this.httpPost = new HttpPost(url);
        this.httpPost.addHeader("content-type", "application/json");
        Response response = null;

        try {
            this.httpPost.setEntity(new StringEntity(body));
            HttpResponse httpResponse = this.httpClient.execute(this.httpPost);
            response = new Response(httpResponse);
        } catch (IOException var5) {
            var5.printStackTrace();
        }

        return response;
    }

    public Response doPut(String url, String body) {
        this.httpPut = new HttpPut(url);
        this.httpPut.addHeader("content-type", "application/json");
        Response response = null;

        try {
            this.httpPut.setEntity(new StringEntity(body));
            HttpResponse httpResponse = this.httpClient.execute(this.httpPut);
            response = new Response(httpResponse);
        } catch (IOException var5) {
            var5.printStackTrace();
        }

        return response;
    }
    public Response doDelete(String url) {
        this.httpDelete = new HttpDelete(url);
        this.httpDelete.addHeader("content-type", "application/json");
        Response response = null;
        try {
            HttpResponse httpResponse = this.httpClient.execute(this.httpDelete);
            response = new Response(httpResponse);
        } catch (IOException var5) {
            var5.printStackTrace();

        }
    return response;
    }
}


