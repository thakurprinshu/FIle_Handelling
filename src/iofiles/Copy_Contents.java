package iofiles;
import java.io.*;

import java.io.*;

public class Copy_Contents {
    public static void main(String[] args) {
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");

        try (
                FileReader fr = new FileReader(inputFile);
                FileWriter fw = new FileWriter(outputFile);
        ) {
            int c;
            while ((c = fr.read()) != -1) {
                fw.write(c);
            }
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

