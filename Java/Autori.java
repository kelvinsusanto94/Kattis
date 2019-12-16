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
public class Autori {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String statement = sc.next();

        if (statement.length() <= 100) {
            String[] parts = statement.split("-");

            for (int i = 0; i < parts.length; i++) {
                System.out.print(parts[i].charAt(0));
            }
        }
    }
}
