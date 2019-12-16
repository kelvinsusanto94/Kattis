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
public class ColdPuter_Science {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int value = sc.nextInt();
        int counter = 0;
        for (int i = 0; i < value; i++) {
            int n = sc.nextInt();

            if (n < 0) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}
