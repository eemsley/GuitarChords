import java.util.Scanner;
public class GuitarChords {

    private static String chord;

    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter a chord you want to learn! Enter \"exit\" to quit.");
            Scanner input = new Scanner(System.in);

            String chord = input.nextLine();
            String row1[] = {"  |", "  |", "  |", "  |", "  |", "  |"};
            String row2[] = {"  |", "  |", "  |", "  |", "  |", "  |"};
            String row3[] = {"  |", "  |", "  |", "  |", "  |", "  |"};
            String row4[] = {"  |", "  |", "  |", "  |", "  |", "  |"};
            String[] chart[] = {row1, row2, row3, row4};
            if (chord.equals("g") || chord.equals("G")) {
                chart[2][0] = "  2";
                chart[1][1] = "  1";
                chart[2][5] = "  3";
            } else if (chord.equals("c") || chord.equals("C")) {
                chart[0][4] = "  1";
                chart[1][2] = "  2";
                chart[2][1] = "  3";
            } else if (chord.equals("d") || chord.equals("D")) {
                chart[1][3] = "  1";
                chart[1][5] = "  2";
                chart[2][4] = "  3";
            } else if (chord.equals("dm") || chord.equals("Dm")) {
                chart[0][5] = "  1";
                chart[1][3] = "  2";
                chart[2][4] = "  3";
            } else if (chord.equals("Em") || chord.equals("em")) {
                chart[1][1] = "  2";
                chart[1][2] = "  3";
            } else if (chord.equals("E") || chord.equals("e")) {
                chart[0][3] = "  1";
                chart[1][1] = "  2";
                chart[1][2] = "  3";
            } else if (chord.equals("F") || chord.equals("f")) {
                chart[0][0] = "  1";
                chart[0][1] = "  1";
                chart[0][2] = "  1";
                chart[0][3] = "  1";
                chart[0][4] = "  1";
                chart[0][5] = "  1";
                chart[1][2] = "  2";
                chart[2][1] = "  3";
                chart[2][2] = "  4";
            } else if (chord.equals("Fm") || chord.equals("fm") || chord.equals("gm") || chord.equals("Gm")) {
                chart[0][0] = "  1";
                chart[0][1] = "  1";
                chart[0][2] = "  1";
                chart[0][3] = "  1";
                chart[0][4] = "  1";
                chart[0][5] = "  1";
                chart[2][1] = "  3";
                chart[2][2] = "  4";
            } else if (chord.equals("a") || chord.equals("A")) {
                chart[1][2] = "  1";
                chart[1][3] = "  2";
                chart[1][4] = "  3";
            } else if (chord.equals("am") || chord.equals("Am")) {
                chart[0][4] = "  1";
                chart[1][2] = "  2";
                chart[1][3] = "  3";
            } else if (chord.equals("b") || chord.equals("B")) {
                chart[1][1] = "  1";
                chart[3][2] = "  2";
                chart[3][3] = "  3";
                chart[3][4] = "  4";
            } else if (chord.equals("bm") || chord.equals("Bm")) {
                chart[1][1] = "  1";
                chart[3][2] = "  2";
                chart[3][3] = "  3";
                chart[2][4] = "  3";
            } else if (chord.equals("exit"))
                break;
            else System.out.println("Sorry, our database does not include that chord.");

            for (int i = 0; i < chart.length; i++) {
                for (int j = 0; j < row1.length; j++) {
                    System.out.print(chart[i][j]);
                }
                System.out.println();
            }
        }
    }
}
