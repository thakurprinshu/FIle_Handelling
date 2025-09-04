package bufferedrw;


import java.io.*;

public class Copy {
    public static void main(String[] args) {
        File source = new File("file1.txt"); // Reuse file1.txt created earlier
        File destination = new File("copy_of_file1.txt");

        try (
                BufferedReader reader = new BufferedReader(new FileReader(source));
                BufferedWriter writer = new BufferedWriter(new FileWriter(destination))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("File copied successfully from " + source.getName() +
                    " to " + destination.getName());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
