import java.util.List;
import java.util.stream.Collectors;

public class Excercise4 {
    public static void main(String[] args) {
        List<Integer> list = List.of(0,1,2,3,3,4,5,6,7,8,9,9);
        List<Integer>listNoDup = list.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(listNoDup);
    }
}
