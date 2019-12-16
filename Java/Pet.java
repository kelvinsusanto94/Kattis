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
public class Pet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int index = 0;
        int tmp = 0;
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                do {
                    int N = sc.nextInt();
                    if (N < 6 && N > 0) {
                        tmp += N;
                        break;
                    }
                } while (true);

            }
            if (max < tmp) {
                max = tmp;
                index = i;
            }
            tmp = 0;
        }

        System.out.println(index + " " + max);
    }
}
