package sample;

import java.io.File;
import java.io.IOException;

public class CreateFileExample1 {

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
		
//		File file = new File("test.txt");
//
//        if (file.delete()) {
//            System.out.println("File deleted successfully");
//        } else {
//            System.out.println("Failed to delete the file");
//        }

	}

}
