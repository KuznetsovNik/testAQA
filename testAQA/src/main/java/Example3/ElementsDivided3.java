package Example3;

import java.util.Arrays;

public class ElementsDivided3 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        Arrays.stream(array).filter(value -> (value % 3 == 0)).forEach(System.out::println);
    }
}
