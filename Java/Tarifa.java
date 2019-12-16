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
public class Tarifa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int N = sc.nextInt();

        int leftover = 0;
        for (int i = 0; i < N; i++) {
            int used = sc.nextInt();
            int tmp = X - used;
            leftover += tmp;
        }

        System.out.println(leftover + X);
    }
}
