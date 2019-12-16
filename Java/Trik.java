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
public class Trik {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hasil = 1;
        int counter = 0;
        int A = 1;
        int B = 0;
        int C = 0;

        String input = sc.nextLine();
        while (counter != input.length()) {
            if (input.charAt(counter) == 'A' && A == 1) {
                hasil = 2;
                B = 1;
                A = 0;
            } else if (input.charAt(counter) == 'A' && B == 1) {
                hasil = 1;
                A = 1;
                B = 0;
            } else if (input.charAt(counter) == 'B' && C == 1) {
                hasil = 2;
                B = 1;
                C = 0;
            } else if (input.charAt(counter) == 'B' && B == 1) {
                hasil = 3;
                B = 0;
                C = 1;
            } else if (input.charAt(counter) == 'C' && A == 1) {
                hasil = 3;
                C = 1;
                A = 0;
            } else if (input.charAt(counter) == 'C' && C == 1) {
                hasil = 1;
                C = 0;
                A = 1;
            }
            counter++;
        }

        System.out.println(hasil);
    }
}
