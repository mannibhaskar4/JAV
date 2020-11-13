import java.util.*;

//Write a program to cyclically rotate an array by one.
public class ArrCyclicallyArrByOne {

    static int a[] = new int[] { 1, 2, 3, 4, 5 };

    static void rotate() {
        int x = a[a.length - 1];
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = x;
    }

    public static void main(String[] args) {
        rotate();
        System.out.println(Arrays.toString(a));
        // int a[] = { 5, 78, 9, 6 };
        // System.out.println(Arrays.toString(a));
    }
}
