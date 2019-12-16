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
public class R2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R1 = sc.nextInt();
        int S = sc.nextInt();

        int R2 = (S * 2) - R1;

        if (R1 < 1000 && R1 > -1000) {
            if (S < 1000 && S > -1000) {
                System.out.println(R2);
            }
        }
    }
}
