package bufferedrw;

import java.io.*;

public class Copy {
    public static void main(String[] args) {

        File source = new File("C:\\Users\\Lenovo\\Desktop\\java\\codes\\iofiles\\source.txt");
        File destination = new File("C:\\Users\\Lenovo\\Desktop\\java\\codes\\iofiles\\destination.txt");

        try (
                BufferedReader reader = new BufferedReader(new FileReader(source));
                BufferedWriter writer = new BufferedWriter(new FileWriter(destination))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
