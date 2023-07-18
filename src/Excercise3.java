import java.util.List;

public class Excercise3 {
    public static void main(String[] args) {
        List<Integer>list=List.of(0,1,2,3,4,5,6,7,8,9,10);
        Integer evenSum = list.stream()
                .filter(x->x%2==0)
                .mapToInt(Integer::intValue)
                .sum();

        Integer oddSum = list.stream()
                .filter((x->x%2==1))
                .mapToInt(Integer::intValue)
                .sum();
    }
}
