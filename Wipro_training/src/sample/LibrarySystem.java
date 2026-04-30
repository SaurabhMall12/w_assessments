package sample;

import java.util.*;

class Book {
    String name;

    Book(String name) {
        this.name = name;
    }

    // important for using as key in HashMap
    public int hashCode() {
        return name.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;

        Book b = (Book) obj;
        return this.name.equals(b.name);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {

        HashMap<Book, Boolean> library = new HashMap<>();

        Book b1 = new Book("Java");
        Book b2 = new Book("Python");
        Book b3 = new Book("DSA");

        library.put(b1, true);
        library.put(b2, false);
        library.put(b3, true);

        // check availability
        for (Book b : library.keySet()) {
            if (library.get(b)) {
                System.out.println(b.name + " is available");
            } else {
                System.out.println(b.name + " is not available");
            }
        }
    }
}