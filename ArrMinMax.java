import java.util.*;

//Find the maximum and minimum element in an array
public class ArrMinMax {
    public static void main(String[] args) {
        Integer a[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        // to find max
        // int min=Collections.min(Arrays.asList(a))
        System.out.println("Mininium = " + Collections.min(Arrays.asList(a)));
        System.out.println("MAximum = " + Collections.max(Arrays.asList(a)));
    }
}
