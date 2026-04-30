package sample;

import java.io.FileWriter;
import java.io.IOException;

public class WriteExample {

	public static void main(String[] args) {
		
		try {
			FileWriter writer = new FileWriter("test1.txt");
			writer.write("Hello this is my first write in java file handling");
			writer.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
