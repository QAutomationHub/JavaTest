package network.ok_http_demo;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class OkHttpDemo {

    public static void main(String[] args) throws IOException {

        OkHttpClient client = new OkHttpClient()
                .newBuilder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .followRedirects(true)
                .retryOnConnectionFailure(true)
                .build();

        Request request = new Request.Builder()
                .url("https://geekbrains.ru")
//                .addHeader("accept", "application/json")
                .build();

        HttpUrl url = new HttpUrl.Builder()
                .scheme("https")
                .host("geekbrains.ru")
//                .addPathSegment("courses")
//                .addQueryParameter("count", 5)
                .build();

        Response response = client.newCall(request).execute();

        String body = response.body().string();

        System.out.println(response.code());
        System.out.println(response.headers());
        System.out.println(response.isSuccessful());
        System.out.println(response.isRedirect());
        System.out.println(response.protocol());
        System.out.println(response.receivedResponseAtMillis());

    }
}
