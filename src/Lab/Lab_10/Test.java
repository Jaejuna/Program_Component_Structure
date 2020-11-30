package Lab.Lab_10;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("poem.txt");
        BufferedReader infile = new BufferedReader(reader);

        FileWriter writer = new FileWriter("poem.txt");
        PrintWriter outfile = new PrintWriter(writer);
        outfile.println("가을이 오면...");
        outfile.print("학기가 ");
        outfile.println("저물어 가고, ");
        outfile.println("시험이 끝나면서 겨울이 온다.");
        outfile.close();
    }
}
