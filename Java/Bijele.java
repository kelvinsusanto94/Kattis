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
public class Bijele {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int king = sc.nextInt();
        int queen = sc.nextInt();
        int rooks = sc.nextInt();
        int bishop = sc.nextInt();
        int knights = sc.nextInt();
        int pawns = sc.nextInt();

        System.out.println((1 - king) + " " + (1 - queen) + " " + (2 - rooks) + " " + (2 - bishop) + " " + (2 - knights) + " " + (8 - pawns));
    }
}
