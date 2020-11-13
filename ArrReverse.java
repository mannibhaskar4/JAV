import java.util.*;

//Reverse the array
public class ArrReverse {
    public static void main(String[] args) {
        Integer a[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        for (int i = 0; i < a.length / 2; i++) {
            Integer c = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = c;
        }
        System.out.println(Arrays.deepToString(a));
    }
}