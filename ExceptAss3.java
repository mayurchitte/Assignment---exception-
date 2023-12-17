
import java.io.*;
import java.util.Scanner;


public class ExceptAss3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the file path (e.g., input.txt): ");
        String filePath = scanner.nextLine();

        try {
            int[] counts = countFileStats(filePath);
            
    
            System.out.println("Character Count: " + counts[0]);
            System.out.println("Word Count: " + counts[1]);
            System.out.println("Line Count: " + counts[2]);

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static int[] countFileStats(String filePath) throws IOException {
        int characterCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                lineCount++;
                characterCount += line.length();

                // Split the line into words using whitespace as delimiter
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
        }

        return new int[]{characterCount, wordCount, lineCount};
    }
}
