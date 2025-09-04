package bufferedrw;

import java.io.*;

public class Files_Create {
    public static void main(String[] args) {
        try {
            BufferedWriter w1 = new BufferedWriter(new FileWriter("file1.txt"));
            w1.write("This is content of file1.");
            w1.close();

            BufferedWriter w2 = new BufferedWriter(new FileWriter("file2.txt"));
            w2.write("This is content of file2.");
            w2.close();

            BufferedWriter w3 = new BufferedWriter(new FileWriter("file3.txt"));
            w3.write("This is content of file3.");
            w3.close();

            System.out.println("Files created successfully!");
        } catch (IOException e) {
            System.out.println("Error creating files: " + e.getMessage());
        }
    }
}
