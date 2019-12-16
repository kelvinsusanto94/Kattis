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
public class FizzBuzz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fizz = sc.nextInt();
        int buzz = sc.nextInt();
        int N = sc.nextInt();

        String print = "no";
        for (int i = 1; i <= N; i++) {
            if (i % fizz == 0) {
                System.out.print("Fizz");
                print = "yes";
            }

            if (i % buzz == 0) {
                System.out.print("Buzz");
                print = "yes";
            }

            if (print.equals("no")) {
                System.out.print(i);
            }

            print = "no";
            System.out.println("");
        }
    }
}
