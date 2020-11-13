import java.util.*;

//Find the "Kth" max and min element of an array 
public class ArrKthMinMax {
    public static void main(String[] args) {
        Integer a[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Arrays.sort(a);
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println("Kth Smallest = " + a[k - 1]);
        System.out.println("Kth largest = " + a[a.length - k]);
        sc.close();

    }
}
