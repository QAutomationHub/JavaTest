package network.ok_http_demo;
// https://restful-booker.herokuapp.com/apidoc/index.html


import okhttp3.*;

import java.io.IOException;

public class RestfulBookerDemo {

    public static void main(String[] args) throws IOException {


        // * ------------------  Auth - CreateToken ------------------

        OkHttpClient client = new OkHttpClient();

        MediaType JSON = MediaType.parse("application/json");
        String authBodyString = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        RequestBody requestBody =
                RequestBody.create(authBodyString, JSON);

        Request authRequest =
                new Request.Builder()
                        .url("https://restful-booker.herokuapp.com/auth")
                        .post(requestBody)
                        .build();

        Response authResponse =
                client.newCall(authRequest).execute();

        String token = authResponse.body().string().split(":")[1];
        System.out.println(token);
        token = token.replaceAll("[\"}]", "");
        System.out.println(token);


        // * ------------------ Booking - CreateBooking ------------------

        String createBookingURL = "https://restful-booker.herokuapp.com/booking";

        String createBookingRequestBody = "{\n" +
                "    \"firstname\" : \"Jim\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

        RequestBody createBookingBody =
                RequestBody.create(createBookingRequestBody, JSON);

        Request createBookingRequest =
                new Request.Builder()
                        .url(createBookingURL)
                        .addHeader("Content-Type", "application/json")
                        .addHeader("Accept", "application/json")
                        .post(createBookingBody)
                        .build();

        Response createBookingResponse =
                client.newCall(createBookingRequest).execute();

        System.out.println(createBookingResponse.body().string());


    }

}
