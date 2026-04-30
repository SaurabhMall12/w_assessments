package sample;
import java.io.File;
import java.io.IOException;

public class CreateFileExample {

	public static void main(String[] args) {
		try {
			File file = new File("test.txt");
			if(file.createNewFile()) {
				System.out.println("file created successfully" + " " + file.getName());
			}else {
				System.out.println("file already exist");
			}
			
		}catch(IOException e) {
			System.out.println("Error Occured");
		}

	}

}
