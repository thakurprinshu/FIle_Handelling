package iofiles;

import java.io.*;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Reverse_Content {
    public static void main(String[] args) {
        StringBuilder content = new StringBuilder();

        try {
            FileReader fr = new FileReader("output.txt");
            int ch;
            while ((ch = fr.read()) != -1) {
                content.append((char) ch);
            }
            fr.close();

            content.reverse();

            FileWriter fw = new FileWriter("reversed.txt");
            fw.write(content.toString());
            fw.close();

            System.out.println("File reversed successfully! Check reversed.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

