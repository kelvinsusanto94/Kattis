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
public class Line_Them_Up {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int values = sc.nextInt();
        String[] list = new String[values];
        for (int i = 0; i < values; i++) {
            list[i] = sc.next();
        }

        String result = "NEITHER";
        int counter = 0;
        while (counter != values - 1) {
            if (list[counter].compareTo(list[counter + 1]) < 0) {
                if (result.equals("NEITHER")) {
                    result = "INCREASING";
                } else if (result.equals("DECREASING")) {
                    result = "NEITHER";
                    break;
                }
            }

            if (list[counter].compareTo(list[counter + 1]) > 0) {
                if (result.equals("NEITHER")) {
                    result = "DECREASING";
                } else if (result.equals("INCREASING")) {
                    result = "NEITHER";
                    break;
                }
            }

            counter++;
        }

        System.out.println(result);
    }
}
