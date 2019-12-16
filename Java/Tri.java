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
public class Tri {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b == c || a == b + c) {
            if (a + b == c) {
                System.out.println(a + "+" + b + "=" + c);
            } else if (a == b + c) {
                System.out.println(a + "=" + b + "+" + c);
            }
        } else if (a - b == c || a == b - c) {
            if (a - b == c) {
                System.out.println(a + "-" + b + "=" + c);
            } else if (a == b - c) {
                System.out.println(a + "=" + b + "-" + c);
            }
        } else if (a / b == c || a == b / c) {
            if (a / b == c) {
                System.out.println(a + "/" + b + "=" + c);
            } else if (a == b / c) {
                System.out.println(a + "=" + b + "/" + c);
            }
        } else if (a * b == c || a == b * c) {
            if (a * b == c) {
                System.out.println(a + "*" + b + "=" + c);
            } else if (a == b * c) {
                System.out.println(a + "=" + b + "*" + c);
            }
        }
    }
}
