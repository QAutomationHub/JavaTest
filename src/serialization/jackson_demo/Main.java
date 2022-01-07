package serialization.jackson_demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;


public class Main {

    private static final ObjectMapper objectMapper = new ObjectMapper();



    public static void main(String[] args) throws JsonProcessingException {



    }


    // * поменялся JSON, класс не содержит поля "address" (добавили аннотацию @JsonIgnoreProperties(ignoreUnknown = true) или objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);)
    private static void deserializationFeatureFailOnUnknown() throws JsonProcessingException {
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false); //
        String networkResponse = "{\"title\":\"Ленинская библиотека\",\"address\":\"ул. Ленина 14\", \"books\":[{\"author\":\"Пушкин\",\"title\":\"Станционный смотритель\",\"pages\":35,\"year\":1820},{\"author\":\"Лукьяненко\",\"title\":\"Ночной дозор\",\"pages\":350,\"year\":2004},{\"author\":\"Дейл Карнеги\",\"title\":\"Как перестать нервничать\",\"pages\":200,\"year\":1960}]}";
        Library libraryFromString = objectMapper.readValue(networkResponse, Library.class);
        System.out.println(libraryFromString);
    }


    // * считываем в List
    private static void readingIntoCollection() throws JsonProcessingException {
        String jsonBooksList = "[{\"author\":\"Пушкин\",\"title\":\"Станционный смотритель\",\"pages\":35,\"year\":1820},{\"author\":\"Лукьяненко\",\"title\":\"Ночной дозор\",\"pages\":350,\"year\":2004},{\"author\":\"Дейл Карнеги\",\"title\":\"Как перестать нервничать\",\"pages\":200,\"year\":1960}]";

        List<Book> bookList = objectMapper.readValue(jsonBooksList, new TypeReference<List<Book>>(){});
        for (Book book : bookList) {
            System.out.println(book);
        }

    }


    // * из JSON в класс
    private static void readObjectFromString() throws JsonProcessingException {
        String firstLibJson = "{\"title\":\"Ленинская библиотека\",\"books\":[{\"author\":\"Пушкин\",\"title\":\"Станционный смотритель\",\"pages\":35,\"year\":1820},{\"author\":\"Лукьяненко\",\"title\":\"Ночной дозор\",\"pages\":350,\"year\":2004},{\"author\":\"Дейл Карнеги\",\"title\":\"Как перестать нервничать\",\"pages\":200,\"year\":1960}]}";

        Library libraryFromString = objectMapper.readValue(firstLibJson, Library.class);
        System.out.println(libraryFromString);
    }


    // * из класса в JSON
    private static void demoWriteObject() throws JsonProcessingException {
        Library firstLib = new Library(
                "Ленинская библиотека",
                new Book[]{
                        new Book("Пушкин", "Станционный смотритель", 35, 1820),
                        new Book("Лукьяненко", "Ночной дозор", 350, 2004),
                        new Book("Дейл Карнеги", "Как перестать нервничать", 200, 1960)
                });

        String jsonFirstLib = objectMapper.writeValueAsString(firstLib);
        System.out.println(jsonFirstLib);
    }

}
