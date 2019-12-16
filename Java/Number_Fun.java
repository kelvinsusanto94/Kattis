/*    .-"-.
*    /|6 6|\
*   {/(_0_)\}
*    _/ ^ \_
*   (/ /^\ \)-'
*    ""' '""     하늘 */

import java.util.Scanner;

/* written by
 * @author Wolverine 왕경민
 */
public class Number_Fun {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        boolean Possible = false;
        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            if (C * B == A || C * A == B) {
                Possible = true;
            } else if (A - B == C || B - A == C) {
                Possible = true;
            } else if (A + B == C) {
                Possible = true;
            } else if (A * B == C) {
                Possible = true;
            }

            if (Possible == true) {
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }

            Possible = false;
        }
    }
}
