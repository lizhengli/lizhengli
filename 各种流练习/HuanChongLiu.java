package FileInout;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class HuanChongLiu {
	public static void main(String[] args) {
		try {
			OutputStreamWriter osw = new OutputStreamWriter(
					new FileOutputStream("path"));
			osw.write("mircosoftibmsunapplehp");
			System.out.println(osw.getEncoding());
			osw.close();
			osw = new OutputStreamWriter(
					new FileOutputStream("path", true),
					"ISO8859_1"); 
			osw.write("mircosoftibmsunapplehp");
			System.out.println(osw.getEncoding());
			osw.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
