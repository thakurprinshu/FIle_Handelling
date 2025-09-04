package bufferedrw;

import java.io.*;

public class Merge_Files {
    public static void main(String[] args) {
        String[] inputFiles = {"file1.txt", "file2.txt", "file3.txt"};
        String outputFile = "merged_feedback.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (String fileName : inputFiles) {
                try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        writer.write(line);
                        writer.newLine();
                    }
                }
            }
            System.out.println("Files merged successfully into " + outputFile);
        } catch (IOException e) {
            System.out.println("Error during merge: " + e.getMessage());
        }
    }
}

