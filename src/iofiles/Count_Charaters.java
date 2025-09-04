package iofiles;

import java.io.*;

import java.io.FileReader;
import java.io.IOException;

public class Count_Charaters {
    public static void main(String[] args) {
        int count = 0;

        try {
            FileReader fr = new FileReader("output.txt");
            int ch;

            while ((ch = fr.read()) != -1) {
                count++;
            }

            fr.close();
            System.out.println("Total characters in file: " + count);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

