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

public class License_to_Launch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int days = 0;
        int min = 1000000000;

        for (int i = 0; i < n; i++) {
            int after = sc.nextInt();
            if (min > after) {
                min = after;
                days = i;
            }
        }

        System.out.println(days);
    }
}
