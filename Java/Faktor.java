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
public class Faktor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        double F = sc.nextInt();
        F -= 0.99;

        int result = (int) Math.ceil(F * A);
        System.out.println(result);
    }
}
