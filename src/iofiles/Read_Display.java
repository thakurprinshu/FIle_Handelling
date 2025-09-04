package iofiles;

import java.io.*;

import java.io.FileReader;
import java.io.IOException;

public class Read_Display {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("example.txt");
            int c;
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

