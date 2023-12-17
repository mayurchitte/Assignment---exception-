
import java.io.*;
import java.util.Scanner;
public class ExceptAss4 {
    public static void main(String[] args) {
        String inputFile = "input1.txt";
        String outputFile = "output1.txt";

        try {
            copyFile(inputFile, outputFile);
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.err.println("Error copying file: " + e.getMessage());
        }
    }

    private static void copyFile(String sourcePath, String destinationPath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(sourcePath));
             FileWriter writer = new FileWriter(destinationPath)) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line + "\n");
            }
        }
    }
}
