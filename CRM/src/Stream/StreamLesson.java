package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamLesson {
    public static void main(String[] args) {
        int[] numbers = new int[]{5,6,8,7,4,58,96,8,5,4,78,9,2,46};
        List<Integer> list = List.of(5,6,8,7,4,58,96,8,5,4,78,9,2,46);

        //1-bo`sh stream
        Stream<Object> s = Stream.empty();

        //2-arraydan stream
        IntStream stream = Arrays.stream(numbers);

    }
}
