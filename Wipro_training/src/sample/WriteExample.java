package sample;

import java.io.FileWriter;
import java.io.IOException;

public class WriteExample {

	public static void main(String[] args) {
		
		try {
			FileWriter writer = new FileWriter("testX2.txt");
			writer.write("Nice time learning File handling");
			writer.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
