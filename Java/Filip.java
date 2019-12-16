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
public class Filip {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int Ar = A / 100;
        A %= 100;
        Ar += (A / 10) * 10;
        A %= 10;
        Ar += A * 100;

        int Br = B / 100;
        B %= 100;
        Br += (B / 10) * 10;
        B %= 10;
        Br += B * 100;

        if (Ar > Br) {
            System.out.println(Ar);
        } else {
            System.out.println(Br);
        }
    }
}
