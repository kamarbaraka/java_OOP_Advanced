package stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StreamTest {
    public static void main(String[] args) {
        try (var fileContent = new Scanner(Path.of("./src/main/resources/file.txt"), StandardCharsets.UTF_8)){
            var list = new ArrayList<String>();
            fileContent.forEachRemaining(list::add);
            list.stream().forEach(System.out::println);
        }
        catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
