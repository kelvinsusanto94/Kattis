/*    .-"-.
*    /|6 6|\
*   {/(_0_)\}
*    _/ ^ \_
*   (/ /^\ \)-'
*    ""' '""     ?? */

import java.util.Scanner;

/* written by
 * @author Wolverine 왕경민
 */
public class Take_Two_Stones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (N >= 1 && N <= 10000000) {
            if (N % 2 == 1) {
                System.out.println("Alice");
            } else {
                System.out.println("Bob");
            }
        }
    }
}
