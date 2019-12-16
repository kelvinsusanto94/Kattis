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
public class Spavanac {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minutes = sc.nextInt();

        if (minutes < 45) {
            if (hour == 0) {
                hour = 23;
            } else {
                hour--;
            }
            minutes += 60;
            minutes -= 45;
        } else if (minutes >= 45) {
            minutes -= 45;
        }

        System.out.println(hour + " " + minutes);
    }
}
