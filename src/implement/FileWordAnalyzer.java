package implement;

import java.io.IOException;
import java.util.*;

public class FileWordAnalyzer {

    private FilePartReader fpr;

    public FileWordAnalyzer(FilePartReader fpr) {
        this.fpr = fpr;
    }

    public ArrayList wordsByABC() throws IOException {
        String lines = fpr.readLines();
        ArrayList<String> linesArray = new ArrayList(Arrays.asList(lines.split("\\s")));

        linesArray.sort(String::compareToIgnoreCase);

        return linesArray;
    }

    public ArrayList wordsContainingSubString(String subString) throws IOException{
        String callStr = fpr.readLines();
        ArrayList<String> allStr = new ArrayList(Arrays.asList(callStr.split("\\s")));
        ArrayList<String> result = new ArrayList<>();

        for(String word : allStr) {
            if(word.toLowerCase().contains(subString)) {
                result.add(word);
            }
        }

        return result;
    }

}
