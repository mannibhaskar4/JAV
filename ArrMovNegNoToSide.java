import java.util.*;

//Move all the negative elements to one side of the array 
public class ArrMovNegNoToSide {
    public static void main(String[] args) {
        Integer a[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        arrange(a, a.length);
        System.out.println(Arrays.deepToString(a));
    }

    public static void arrange(Integer a[], int len) {
        int j = 0, temp;
        for (int i = 0; i < len; i++) {
            if (a[i] < 0) {
                if (i != j) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                j++;
            }
        }
        // System.out.println(Arrays.deepToString(a));
    }
}
