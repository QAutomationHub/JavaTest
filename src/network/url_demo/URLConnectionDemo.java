package network.url_demo;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

public class URLConnectionDemo {

    public static void main(String[] args) throws IOException {

        URL url = new URL("https://geekbrains.ru");
        HttpURLConnection httpURLConnection = (HttpURLConnection)
                url.openConnection();

        httpURLConnection.connect();

        System.out.println(httpURLConnection.getResponseCode());
        System.out.println(httpURLConnection.getResponseMessage());
        System.out.println(httpURLConnection.getRequestMethod());
        System.out.println(httpURLConnection.getConnectTimeout());
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        for (String k: headerFields.keySet()) {
            System.out.printf("Ключ: %s, ----------> Значение: %s \n", k, headerFields.get(k));
        }

    }


    private static void openStream() throws IOException {
        URL url = new URL("https://geekbrains.ru");
        InputStream inputStream = url.openStream();
        new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8))
                .lines()
                .forEach(System.out::println);
    }


    private static void urlConnectionDemo() throws IOException {
        URL url = new URL("https://geekbrains.ru");

        URLConnection urlConnection = url.openConnection();
        InputStream inputStream = urlConnection.getInputStream();
        BufferedReader bf = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        PrintWriter htmlFileWriter = new PrintWriter("gb.main.html");
        String current;
        while ((current = bf.readLine()) != null) {
            htmlFileWriter.write(current);
        }
        htmlFileWriter.close();
        bf.close();
        inputStream.close();
    }



}
