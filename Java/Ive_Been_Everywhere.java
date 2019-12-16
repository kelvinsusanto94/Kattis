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
public class Ive_Been_Everywhere {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Case = sc.nextInt();

        String[] visited = new String[100];
        for (int i = 0; i < Case; i++) {
            int cities = sc.nextInt();
            int counter = cities;

            for (int j = 0; j < cities; j++) {
                visited[j] = sc.next();
            }

            for (int j = 0; j < cities; j++) {
                for (int k = j; k < cities; k++) {
                    if (j == k && j != cities - 1) {
                        k++;
                    } else if (j == k && j == cities - 1) {
                        break;
                    }

                    if (visited[j].equals(visited[k])) {
                        counter--;
                        break;
                    }
                }
            }

            System.out.println(counter);
        }
    }
}
