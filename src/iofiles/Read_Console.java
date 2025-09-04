package iofiles;

import java.io.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Read_Console {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text (type 'exit' to stop):");

        try {
            FileWriter fw = new FileWriter("output.txt");

            while (true) {
                String line = sc.nextLine();  // read line from console
                if (line.equalsIgnoreCase("exit")) {
                    break;
                }
                fw.write(line + "\n");
            }

            fw.close();
            System.out.println(" Data written to output.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

