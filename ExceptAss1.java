import java.util.Scanner;

public class ExceptAss1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your list of integers : ");
        String line = scanner.nextLine();

        String[] tokens = line.split("\\s+"); 

        boolean hasDuplicate = false;
        int[] numbers = new int[tokens.length];

        for (int i = 0; i < tokens.length; i++) {
            try {
                numbers[i] = Integer.parseInt(tokens[i]); 
            } catch (NumberFormatException e) {
                System.err.println("Invalid input: " + tokens[i]);
                return;
            }

            for (int j = 0; j < i; j++) { 
                if (numbers[i] == numbers[j]) {
                    hasDuplicate = true;
                    break;
                }
            }

            if (hasDuplicate) {
                System.err.println("Duplicate number found: " + numbers[i]);
                break;
            }
        }

        if (!hasDuplicate) {
            System.out.println("No duplicate numbers!");
        }
    }
}
