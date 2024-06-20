import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 10, 1, 9, 5));

        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.println(n));

        List<Integer> collect =
                numbers.stream().map(integer -> integer * 2).collect(Collectors.toList());

        for (int i : collect) {
            System.out.println(i);
        }

    }
}