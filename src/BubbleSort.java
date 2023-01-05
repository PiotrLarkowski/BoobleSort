import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {

    public static List<BigDecimal> sort(List<BigDecimal> input) {
        boolean change;
        BigDecimal middleValue;
        do {
            change = false;
            if(input==null) {
                throw new RuntimeException("Only null in List!");
            }
            for (int i = 0; i < input.size()-1; i++) {
                if(input.get(i)==null){
                    input.remove(i);
                    continue;
                }
                int a = input.get(i + 1).compareTo(input.get(i));
                if (input.get(i + 1).compareTo(input.get(i))==-1) {
                    middleValue = input.get(i);
                    input.set(i,input.get(i+1));
                    input.set(i + 1,middleValue);
                    change = true;
                }
            }
        }while (change);
        return input;
    }
    public static void test(){
        System.out.println(sort(new ArrayList<>(Arrays.asList(BigDecimal.valueOf(1), BigDecimal.valueOf(4), BigDecimal.valueOf(5),
                BigDecimal.valueOf(6), BigDecimal.valueOf(8), BigDecimal.valueOf(3), BigDecimal.valueOf(8)))));
        System.out.println("====================================================");
        System.out.println(sort(new ArrayList<>(Arrays.asList(BigDecimal.valueOf(1), BigDecimal.valueOf(3), BigDecimal.valueOf(4),
                BigDecimal.valueOf(5), BigDecimal.valueOf(6), BigDecimal.valueOf(8), BigDecimal.valueOf(8)))));
        System.out.println("====================================================");
        System.out.println(sort(new ArrayList<>(Arrays.asList(BigDecimal.valueOf(-9.3), BigDecimal.valueOf(0.2), BigDecimal.valueOf(4),
                BigDecimal.valueOf(0.1), BigDecimal.valueOf(5), BigDecimal.valueOf(9)))));
        System.out.println("====================================================");
        System.out.println(sort(new ArrayList<>()));
        System.out.println("====================================================");
        System.out.println(sort(new ArrayList<>(Arrays.asList(null,BigDecimal.valueOf(5.0001)))));
        System.out.println("====================================================");
        System.out.println(sort(null));
    }
    public static void main(String[] args) {
        test();
    }
}