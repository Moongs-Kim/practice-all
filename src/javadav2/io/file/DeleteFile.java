package javadav2.io.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DeleteFile {

    public static void main(String[] args) throws IOException {
        Path dir = Path.of("temp/exampleDir");
        Path file1 = Path.of("temp/copy.dat");
        Path file2 = Path.of("temp/hello2.txt");
        Path file3 = Path.of("temp/newExample.txt");
        Path file4 = Path.of("temp/copy_new.dat");

        Files.delete(dir);
        Files.delete(file1);
        Files.delete(file2);
        Files.delete(file3);
        Files.delete(file4);


    }
}
