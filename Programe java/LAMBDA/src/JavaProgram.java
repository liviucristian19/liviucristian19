import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

public class JavaProgram {
    public static void main(String[] args) {

        int[] numbers = {13, 8, -9, 15, -1, -78, 5, 69};
    Arrays.stream(numbers).forEach(System.out::println);
    }
}

