package input_output_tools.working_with_files;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class StreamDemo {

// *                   | байтовый поток | символьный поток |
// *           ---------------------------------------------
// *            чтение | InputStream    |       Reader     |
// *           ---------------------------------------------
// *            запись | OutputStream   |       Writer     |
// *           ---------------------------------------------


    public static void main(String[] args) {

        // * способ 1 (Запись в файл)
//        File file = new File("./out_file.txt");
//        try(OutputStream out = new FileOutputStream(file, true)) {
//            out.write("I Love Java".getBytes());
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        // * способ 2 (Запись в файл)
        /*
        File file = new File("./out_file.txt");
        OutputStream out = null;
        try {
            out = new FileOutputStream(file); // перезаписывает, append: true - дописывает
            out.write(65);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        */
        // * Запись в файл (без буфера)
        /*
        File file = new File("./out_file.txt");

        long start = System.currentTimeMillis();

        try (OutputStream out = new FileOutputStream(file)) {
            for (int i = 0; i < 5 * 1024 * 1024; i++) {
                out.write(65);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(System.currentTimeMillis() - start);
*/
        // * Запись в файл (с буфером)
        /*
        File file = new File("./out_file.txt");

        long start = System.currentTimeMillis();

        try (OutputStream out = new BufferedOutputStream(new FileOutputStream(file))) {
            for (int i = 0; i < 5 * 1024 * 1024; i++) {
                out.write(65);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(System.currentTimeMillis() - start);
*/

        // * Чтение из файла
 /*
        File file = new File("./out_file.txt");

        try (InputStream in = new FileInputStream(file)){
            do {
                System.out.println((char) in.read());
            } while (in.read() != -1);
//            System.out.println((char) in.read());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
*/

        // * Запись в файл
/*
        File file = new File("ru.txt");

        try (OutputStream out = new FileOutputStream(file)){
            out.write("Привет, мир".getBytes(StandardCharsets.UTF_8));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
*/
        // * ----- * ----- Чтение без кодировки ----- * -----
/*
        try (InputStream in = new FileInputStream(file)){
            int x;
            while ((x = in.read()) != -1) {
                System.out.print((char) x);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    // ÐÑÐ¸Ð²ÐµÑ, Ð¼Ð¸Ñ

 */
        // * ----- * -----  Чтение с кодировкой ----- * -----
/*
        try (InputStreamReader in = new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8) ){
            int x;
            while ((x = in.read()) != -1) {
                System.out.print((char) x);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
     // Привет, мир
*/
        // * ----- * -----  Чтение с кодировкой ----- * -----

        File file = new File("ru.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

            String str = reader.readLine();
            System.out.println(str);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
