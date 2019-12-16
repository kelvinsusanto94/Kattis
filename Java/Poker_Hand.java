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

public class Poker_Hand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] hand = new String[5];
        for (int i = 0; i < 5; i++) {
            hand[i] = sc.next();
        }

        int score = 1;
        int max = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j && i != 4) {
                    j++;
                } else if (i == j && j == 4) {
                    break;
                }

                if (hand[i].charAt(0) == hand[j].charAt(0)) {
                    score++;
                }
            }
            if (max < score) {
                max = score;
            }
            score = 1;
        }

        System.out.println(max);
    }
}
