import java.util.Comparator;
import java.util.List;

public class Excercise7 {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(0,1,2,3,4,5,6,7,8,9,10);
        Integer i = integerList.stream()
                .max(Comparator.naturalOrder())
                .get();
        System.out.println(i);
    }
}
