package sample;

import java.io.*;

class Student implements Serializable {
	
	private static final long serialVersionUID = 1L;
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SerializeExample {
    public static void main(String[] args) throws Exception {
        Student s = new Student(1, "Saurabh");

        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("student.txt"));
        oos.writeObject(s);
        oos.close();
    }
}