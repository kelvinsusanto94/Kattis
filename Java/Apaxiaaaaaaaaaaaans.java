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
public class Apaxiaaaaaaaaaaaans {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String statement = sc.next();
        String[] parts = statement.split("");

        for (int i = 0; i < parts.length - 1; i++) {
            if (!parts[i].equals(parts[i + 1])) {
                System.out.print(parts[i]);
            }
        }

        System.out.print(parts[parts.length - 1]);
    }
}
