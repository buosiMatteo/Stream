import java.util.List;

public class Excercise6 {
    public static void main(String[] args) {
        List<String> list = List.of("ciao", "hello", "cocomero","mango","albero","zolfo","ananas");
        List<String> orderedList= list.stream()
                .sorted()
                .toList();
        System.out.println(orderedList);
    }
}
