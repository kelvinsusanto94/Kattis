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
public class Cryptographers_Conundrum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String statement = sc.next();
        String[] parts = statement.split("");

        int counter = 1;
        int result = 0;
        for (int i = 0; i < parts.length; i++) {
            if (counter == 1) {
                if (!parts[i].equals("P")) {
                    result++;
                }
            } else if (counter == 2) {
                if (!parts[i].equals("E")) {
                    result++;
                }
            } else if (counter == 3) {
                if (!parts[i].equals("R")) {
                    result++;
                }
            }

            counter++;
            if (counter > 3) {
                counter = 1;
            }
        }

        System.out.println(result);
    }
}
