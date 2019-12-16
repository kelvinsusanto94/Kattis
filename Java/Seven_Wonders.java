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
public class Seven_Wonders {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double cT = 0;
        double cG = 0;
        double cC = 0;

        String input = sc.next();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'T') {
                cT++;
            } else if (input.charAt(i) == 'C') {
                cC++;
            } else if (input.charAt(i) == 'G') {
                cG++;
            }
        }
        double set = Math.min(cC, cT);
        set = Math.min(set, cG);

        double point = 0;
        point += Math.pow(cT, 2) + Math.pow(cC, 2) + Math.pow(cG, 2);
        point += set * 7;

        System.out.println((int) point);
    }
}
