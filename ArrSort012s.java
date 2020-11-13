import java.util.*;

//Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo
public class ArrSort012s {
    public static void main(String[] args) {
        Integer a[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        sort012(a, a.length);
        System.out.println(Arrays.deepToString(a));
    }

    public static void sort012(Integer a[], int len) {
        int lo = 0, mid = 0, hi = len - 1, c = 0;
        while (mid <= hi) {
            switch (a[mid]) {
                case 0:
                    c = a[mid];
                    a[mid] = a[lo];
                    a[lo] = c;
                    lo++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    c = a[hi];
                    a[hi] = a[mid];
                    a[mid] = c;
                    hi--;
                    break;

            }
        }
    }
}
