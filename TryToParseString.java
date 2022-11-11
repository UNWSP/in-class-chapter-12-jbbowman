public class TryToParseString {
    public static void main(String[] args) {
        try {
            Integer.parseInt("Not an integer");
        } catch (NumberFormatException e) {
            System.out.println("Invalid integer");
        }
    }
}
