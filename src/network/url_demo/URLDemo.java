package network.url_demo;

import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {

    public static void main(String[] args) throws MalformedURLException {

        // * Способ 1
//        URL url = new URL("https://geekbrains.ru/cources");
//        System.out.println(url.getPort());
//        System.out.println(url.getHost());
//        System.out.println(url.getPath());

        // * Способ 2
        URL url = new URL("https", "geekbrains.ru", 443, "/cources");
        System.out.println(url.getPort());
        System.out.println(url.getHost());
        System.out.println(url.getPath());

    }



}
