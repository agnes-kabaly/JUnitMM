package implement;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FileWordAnalyzerTest {
    @Test
    public void testWordsByABC() throws IOException{
        FileWordAnalyzer fWAn = new FileWordAnalyzer(new FilePartReader("src/textcontent/valami.txt", 1, 1));
        List<String> toTest = Arrays.asList("aaa", "bbb", "ccc");
        ArrayList<String> result = fWAn.wordsByABC();

        assertEquals(toTest, result);
    }

    @Test
    public void testWordsContainingSubString() throws IOException{
        FileWordAnalyzer fWAn = new FileWordAnalyzer(new FilePartReader("src/textcontent/valami.txt", 1, 1));
        List<String> toTest = Arrays.asList("bbb");

        ArrayList<String> result = fWAn.wordsContainingSubString("b");

        assertEquals(toTest, result);
    }
}