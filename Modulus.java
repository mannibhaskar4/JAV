public class Modulus {
    public static void main(String args[]) {
        int x = 42, c = 0, s = 0;
        double y = 42.25;
        System.out.println("x mod 10 = " + x % 10);
        System.out.println("y mod 10 = " + y % 10);
        for (int i = 5;; i += 2) {
            c++;
            System.out.println(i);
            s = s + i;
            if (s == 396)
                break;
        }
        System.out.println(c);
        c = 0;
        for (int i = 32; i <= 59; i += 2) {
            c += i;
        }
        System.out.println(c);
    }
}
