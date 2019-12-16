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
public class ABC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }

        String statement = sc.next();
        int PosA = statement.indexOf("A");
        int PosB = statement.indexOf("B");
        int PosC = statement.indexOf("C");

        int max = Math.max(arr[0], arr[1]);
        max = Math.max(max, arr[2]);
        int min = Math.min(arr[0], arr[1]);
        min = Math.min(min, arr[2]);
        int mid = (arr[0] + arr[1] + arr[2]) - max - min;

        arr[PosA] = min;
        arr[PosB] = mid;
        arr[PosC] = max;

        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
