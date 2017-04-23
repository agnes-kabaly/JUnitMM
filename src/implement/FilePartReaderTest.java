package implement;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class FilePartReaderTest {
    @Test
    public void testReadLines() throws IOException{
        FilePartReader fpr = new FilePartReader("src/textcontent/valami.txt", 1, 1);
        String result = fpr.readLines();

        assertEquals("bbb ccc aaa" + "\n", result);

    }
}