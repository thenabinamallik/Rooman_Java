package Test;

import java.io.FileReader;
import static utils.printUtils.sop;

public class MyChecked {
	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("C:/Users/nabin/Desktop/demo.txt");
			int ch;
            while ((ch = file.read()) != -1) {
				sop((char)ch);
            }
		} catch (Exception e) {
			sop(e);
		}
	}
}