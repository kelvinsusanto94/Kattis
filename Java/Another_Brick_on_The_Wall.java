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
public class Another_Brick_on_The_Wall {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int height = sc.nextInt();
        int width = sc.nextInt();
        int[] bricks = new int[sc.nextInt()];

        for (int i = 0; i < bricks.length; i++) {
            bricks[i] = sc.nextInt();
        }

        int currentW = 0;
        int currentH = 0;
        String complete = "NO";
        for (int i = 0; i < bricks.length; i++) {
            currentW += bricks[i];

            if (currentW > width) {
                break;
            } else if (currentW == width) {
                currentW = 0;
                currentH++;
            }

            if (currentH == height) {
                complete = "YES";
                break;
            }
        }

        System.out.println(complete);
    }
}
