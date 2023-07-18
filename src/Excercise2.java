import java.util.List;
import java.util.stream.Collectors;

public class Excercise2 {
    public static void main(String[] args) {

        List<String> stringList = List.of("ciao", "sono", "Matteo");
        List<String> strings = stringList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(strings);
    }
}
