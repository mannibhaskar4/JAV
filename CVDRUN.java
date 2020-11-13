/*COVID RUN
Covid-19 is spreading fast! There are N cities, numbered from 0 to (N−1), arranged in a circular 
manner. City 0 is connected to city 1, 1 to 2, …, city (N−2) to city (N−1), and city (N−1) to city 0.

The virus is currently at city X. Each day, it jumps from its current city, to the city K to its 
right, i.e., from city X to the city (X+K)%N. As the virus jumps, the cities in between don't get
infected. Cities once infected stay infected. You live in city Y. Find if it will reach your city 
eventually. If it will, print YES, else print NO.

Input:
The first line of the input consists of an integer T, the number of test cases.
The first and only line of each test case contains four space-separated integers - N, K, X and Y, 
denoting the number of cities, the size of jumps, Covid's current city, and the city that you live 
in, respectively.
Output:
For each test case, in a new line, print YES if Covid shall reach your city after a finite number 
of days, else print NO.

Constraints
1≤T≤100
1≤N≤1000
0≤X,Y≤N−1
0≤K≤1000
Subtasks
Subtask 1 - 100% - Original constraints
Sample Input:
2
6 2 5 3
12 3 4 2
Sample Output:
YES
NO
Explanation:
In the first sample, Covid starts at city 5, then goes to city 1, and then from city 1 to city 3. Thus, it reaches the city that you live in.

In the second sample, Covid starts at city 4, goes to city 7, then 10, 1, then 4, 7, 10, …, and so on. It never reaches city 2.


*/

import java.util.*;
// import java.lang.*;
// import java.io.*;

public class CVDRUN {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int T = 0;
        if (sc.hasNextInt()) {
            T = sc.nextInt();
        }

        if (T >= 1 && T <= 100)
            for (int i = 1; i <= T; i++) {
                // System.out.println("YES");
                int N = sc.nextInt();
                if (N >= 1 && N <= 1000) {
                    int K = sc.nextInt();
                    int X = sc.nextInt();
                    int Y = sc.nextInt();
                    if (X >= 0 && Y <= N - 1) {
                        if (K >= 0 && K <= 1000) {
                            // int a[]=new int[N];
                            // for(int i=0;i<N;i++){
                            // a[i]=i;
                            // }
                            int c = -1, p = X, d = 0;
                            while (c != X) {
                                p = (p + K) % N;
                                if (p == Y) {
                                    System.out.println("YES");
                                    d = 1;
                                    break;
                                }
                                c = p;

                            }
                            if (d == 0)
                                System.out.println("NO");

                        }
                    }

                }

            }
    }
}
