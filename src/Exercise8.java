import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;

public class Exercise8 {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(0,1,2,3,4,5,6,7,8,9,10);
        Integer i = integerList.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println(i);
    }
}
