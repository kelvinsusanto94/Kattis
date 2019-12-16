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
public class Left_Beehind {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int counter = 1;
        while (true) {
            int sweet = sc.nextInt();
            int sour = sc.nextInt();
            if (sweet == 0 && sour == 0) {
                break;
            }

            if (sweet + sour == 13) {
                System.out.println("Never speak again.");
            } else if (sweet == sour) {
                System.out.println("Undecided.");
            } else if (sour > sweet) {
                System.out.println("Left beehind.");
            } else if (sweet > sour) {
                System.out.println("To the convention.");
            }

            counter++;
            if (counter == 15) {
                break;
            }
        }
    }
}
