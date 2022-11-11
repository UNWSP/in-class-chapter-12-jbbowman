import java.util.stream.IntStream;

public class GoTooFar {
    public static void main(String[] args) {
        int[] integers = IntStream.range(1, 6).toArray();

        try {
            for (int i = 0; i < 6; ++i) {
                System.out.println(integers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Now you've gone too far");
        }
    }
}
