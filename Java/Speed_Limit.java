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
public class Speed_Limit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hasil = 0;
        int before = 0;
        while (true) {
            int input = sc.nextInt();
            if (input == -1) {
                break;
            }

            for (int i = 0; i < input; i++) {
                int miles = sc.nextInt();
                int after = sc.nextInt();
                hasil += (miles * (after - before));
                before = after;
            }

            System.out.println(hasil + " miles");
            before = 0;
            hasil = 0;
        }
    }
}
