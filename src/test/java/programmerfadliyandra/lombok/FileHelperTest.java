package programmerfadliyandra.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;

public class FileHelperTest {

    @Test
    void testPom() throws Exception {
        String text = FileHelper.loadFile("pom.xml");
        System.out.println(text);
    }
    @Test
    void testFileNotFound() throws Exception {
        Assertions.assertThrows(FileNotFoundException.class, ()->{
            FileHelper.loadFile("tidakada.txt");
        });
    }
}
