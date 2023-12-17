
class NoMatchException extends Exception {
    public NoMatchException(String message) {
        super(message);
    }
}
public class ExceptAss2 {
    public static void main(String[] args) {
        try {
           
            checkString("USA");  
        } catch (NoMatchException e) {
            
            System.out.println("Exception: " + e.getMessage());
        }
    }

   
    private static void checkString(String input) throws NoMatchException {
        if (!"India".equals(input)) {
           
            throw new NoMatchException("The string does not match 'India'");
        } else {
            System.out.println("The string matches 'India'");
        }
    }
}
