// import java.io.BufferedWriter;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.util.Scanner;
import java.io.*;
import java.util.Scanner;
public class ExceptAss5 {
    public static void main(String[] args) {
        try {
        
            FileWriter fileWriter = new FileWriter("output2.txt");
            
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

   
            Scanner scanner = new Scanner(System.in);

        
            double totalValue = 0;

            
            for (int i = 1; i <= 5; i++) {
                System.out.println("Enter details for Product " + i);

             
                System.out.print("Product Code: ");
                int productCode = scanner.nextInt();

                
                System.out.print("Cost: $");
                double cost = scanner.nextDouble();

                
                System.out.print("Number of Items: ");
                int numberOfItems = scanner.nextInt();

                
                double productValue = cost * numberOfItems;
                totalValue += productValue;

               
                bufferedWriter.write("Product Code: " + productCode + "\n");
                bufferedWriter.write("Cost: $" + cost + "\n");
                bufferedWriter.write("Number of Items: " + numberOfItems + "\n");
                bufferedWriter.write("Product Value: $" + productValue + "\n");
                bufferedWriter.write("\n");
            }

            
            bufferedWriter.write("Total Value of All Products: $" + totalValue);

        
            scanner.close();
            bufferedWriter.close();
            fileWriter.close();

            System.out.println("Product details written to output.txt successfully.");

        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
