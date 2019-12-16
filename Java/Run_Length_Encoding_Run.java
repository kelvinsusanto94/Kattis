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
public class Run_Length_Encoding_Run {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] parts = input.split(" ");

        if (parts[0].equals("E")) {
            String statement = parts[1];

            int counter = 1;
            for (int i = 0; i < statement.length(); i++) {
                if (i + 1 != statement.length()) {
                    if (statement.charAt(i) == statement.charAt(i + 1)) {
                        counter++;
                    } else {
                        System.out.print(statement.charAt(i));
                        System.out.print(counter);
                        counter = 1;
                    }
                } else {
                    System.out.print(statement.charAt(i));
                    System.out.print(counter);
                }
            }
        } else if (parts[0].equals("D")) {
            String statement = parts[1];

            for (int i = 0; i < statement.length(); i += 2) {
                int counter = Integer.parseInt(statement.substring(i + 1, i + 2));
                for (int j = 0; j < counter; j++) {
                    System.out.print(statement.charAt(i));
                }
            }
        }
    }
}
