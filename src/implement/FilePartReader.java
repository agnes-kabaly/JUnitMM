package implement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class FilePartReader {

    private String filePath;
    private int fromLine;
    private int toLine;

    public FilePartReader(String filePath, int fromLine, int toLine) {
        this.filePath = filePath;
        this.fromLine = fromLine;
        this.toLine = toLine;

        if (toLine < fromLine || fromLine < 1) {
            throw new IllegalArgumentException("toLine smaller than fromLine or fromLine smaller than 1!");
        }
    }

    public String read() throws IOException {
        String fileContent = "";

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = br.readLine()) != null) {
            fileContent += line + "\n";
        }
        br.close();
        return fileContent;
    }

    public String readLines() throws IOException {
        String everyLine = "";
        List<String> stringList = Arrays.asList(read().split("\n"));

        for (int i = 0; i < stringList.size(); i++) {
            if (i >= fromLine-1 && i < toLine) {
                everyLine += stringList.get(i);
                if(i != stringList.size()-1){
                   everyLine += "\n";
                }
            }
        }

        return everyLine;
    }

    /*public static void main(String[] args) throws IOException{
        FilePartReader fpr = new FilePartReader("src/textcontent/valami.txt", 1, 12);
        FileWordAnalyzer fwanal = new FileWordAnalyzer(fpr);

        //System.out.print(fwanal.wordsContainingSubString("oszt"));
        //System.out.print(fwanal.wordsByABC());
        System.out.print(fpr.readLines());
    }*/

}
