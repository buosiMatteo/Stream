import java.util.List;

public class Excercise1 {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(0,1,2,3,4,5,6,7,8,9,10);
        Double average = integerList.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println(average);
    }
}