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
public class One_Chicken__Per_Person {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int guest = sc.nextInt();
        int chicken = sc.nextInt();

        if (guest < chicken) {
            int result = chicken - guest;
            if (result == 1) {
                System.out.println("Dr. Chaz will have " + result + " piece of chicken left over!");
            } else {
                System.out.println("Dr. Chaz will have " + result + " pieces of chicken left over!");
            }
        } else if (chicken < guest) {
            int result = guest - chicken;
            if (result == 1) {
                System.out.println("Dr. Chaz needs " + result + " more piece of chicken!");
            } else {
                System.out.println("Dr. Chaz needs " + result + " more pieces of chicken!");
            }
        }
    }
}
