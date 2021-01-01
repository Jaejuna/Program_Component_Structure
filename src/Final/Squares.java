package Final;

import java.io.*;

public class Squares {

	public static void main(String[] args) throws IOException {
		BufferedReader infile = new BufferedReader(new FileReader("data.in"));
		PrintWriter outfile = new PrintWriter(new FileWriter("data.out"));
		try {
			while (infile.ready()) {
				int i = Integer.parseInt(infile.readLine().trim());
				outfile.println(i + "의 제곱은 " + (i * i) + " 입니다.");
			}
		} catch (NumberFormatException e) {
			int i = Integer.parseInt(infile.readLine().trim());
			System.out.println( i + "은(는) 비정상 입력으로 무시합니다.");
		}
		infile.close();
        outfile.close();
	}
}

