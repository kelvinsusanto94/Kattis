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
public class No_Duplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();
        String[] parts = n.split(" ");

        String norepeat = "yes";
        for (int i = 0; i < parts.length; i++) {
            for (int j = i + 1; j < parts.length; j++) {
                if (parts[i].equals(parts[j])) {
                    norepeat = "no";
                    break;
                }
            }
        }

        System.out.println(norepeat);
    }
}
