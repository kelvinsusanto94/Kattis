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
public class Saving_Princess_Peach {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> obstacles = new ArrayList<Integer>();
        int steps = sc.nextInt();
        int obstacleNo = sc.nextInt();

        for (int i = 0; i < obstacleNo; i++) {
            int tmp = sc.nextInt();
            obstacles.add(tmp);
        }

        int counter = 0;
        for (int i = 0; i < steps; i++) {
            if (obstacles.contains(i)) {
                counter++;
            } else {
                System.out.println(i);
            }
        }

        System.out.println("Mario got " + counter + " of the dangerous obstacles.");
    }
}
