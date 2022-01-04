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

        File file = new File("./out_file.txt");

        // * способ 1
        try(OutputStream out = new FileOutputStream(file, true)) {
            out.write("I Love Java".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        // * способ 2
        /*
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


    }
}
