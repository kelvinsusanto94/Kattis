/*    .-"-.
*    /|6 6|\
*   {/(_0_)\}
*    _/ ^ \_
*   (/ /^\ \)-'
*    ""' '""     하늘 */

import java.util.ArrayList;
import java.util.Scanner;

/* written by
 * @author Wolverine 왕경민
 */
public class Modulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] number = new int[10];
        for (int i = 0; i < 10; i++) {
            number[i] = sc.nextInt();
        }

        ArrayList<Integer> sorted = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int tmp = number[i] % 42;

            if (!sorted.contains(tmp)) {
                sorted.add(tmp);
            }
        }

        System.out.println(sorted.size());
    }
}
