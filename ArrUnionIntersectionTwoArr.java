import java.util.*;

// Find the Union and Intersection of the two sorted arrays.
public class ArrUnionIntersectionTwoArr {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 4, 5, 6 };
        int arr2[] = { 2, 3, 5, 7 };
        int m = arr1.length;
        int n = arr2.length;
        printUnion(arr1, arr2, m, n);
        System.out.println();
        printIntersection(arr1, arr2, m, n);
    }

    public static void printUnion(int a[], int b[], int m, int n) {
        int i = 0, j = 0;
        while (i < m && i < n) {
            if (a[i] < b[j])
                System.out.print(a[i++] + " ");
            else if (a[i] > b[j])
                System.out.print(b[j++] + " ");
            else {
                System.out.print(b[j++] + " ");
                i++;
            }

        }
        while (i < m)
            System.out.print(a[i++] + " ");
        while (j < n)
            System.out.print(b[j++] + " ");
    }

    public static void printIntersection(int a[], int b[], int m, int n) {
        int i = 0, j = 0;
        while (i < m && i < n) {
            if (a[i] < b[j])
                // System.out.print(a[i++] + " ");
                i++;
            else if (a[i] > b[j])
                // System.out.print(b[j++] + " ");
                j++;
            else {
                System.out.print(b[j++] + " ");
                i++;
            }

        }
        // while (i < m)
        // System.out.print(a[i++] + " ");
        // while (j < n)
        // System.out.print(b[j++] + " ");
    }
}
