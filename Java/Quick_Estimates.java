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
public class Quick_Estimates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int counter = 0;
        for (int i = 0; i < n; i++) {
            String input = sc.next();

            for (int j = 0; j < input.length(); j++) {
                counter++;
            }
            System.out.println(counter);
            counter = 0;
        }
    }
}
