import java.util.List;
import java.util.stream.Collectors;

public class Excercise5 {
    public static void main(String[] args) {
        List<String> list = List.of("ciao", "hello", "cocomero");
        String aChar = "c";
        List<String> list2 = list.stream()
                .filter(s -> s.startsWith(aChar))
                .toList();
        System.out.println(list2);

    }

}
