import java.util.Scanner;

public class MakingGame {

    private static final String Centipede = null;
    private static final char RIGHT = 0;
    private static final char LEFT = 0;
    private static final int Player = 0;
    private static final int wall = 0;
    static Scanner scanner = new Scanner(System.in);

    static int column = 1;
    static int row = 1;
    static char[][] map = {{'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
            {'X', 'P', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X'},
            {'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X', 'X'},
            {'X', 'X', 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X'},
            {'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X'},
            {'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X', 'X', ' ', 'X'},
            {'X', 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X'},
            {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'}};
    private static boolean Ptuchx;

    public static void main(String[] args) {
        // String value = getValueFromChar(inputChar);
        // System.out.println(inputChar);
        // scanner.close();

        // TODO Auto-generated method stub

        for (int i = 0; i < map.length; i++) {
            System.out.println(String.valueOf(map[i]));

        }
        char inputChar;

        do {
            inputChar = getInputCharFromUser();
            movePlayer(inputChar);
            for (int i = 0; i < map.length; i++) {
                System.out.println(String.valueOf(map[i]));

            }

        } while (checkExitChar(inputChar) == false);

    }

    private static boolean checkExitChar(char inputChar) {
        if (inputChar == 'e')
            return true;
        if (inputChar == 'E')
            return true;

        return false;

    }

    public static char getInputCharFromUser() {
        final String CHAR_PROMPT = "Enter input char: ";
        System.out.println(CHAR_PROMPT);

        char inputChar = scanner.nextLine().charAt(0);
        return inputChar;

    }

    public static void movePlayer(char inputChar) {

        switch (inputChar) {
            case 'r':

                map[column][row] = ' ';
                row++;

                if (map[column][row] != 'X') {
                    map[column][row] = 'P';
                } else {
                    row--;
                    map[column][row] = 'P';
                }
                break;

            case 'd':

                map[column][row] = ' ';
                column++;

                if (map[column][row] != 'X') {
                    map[column][row] = 'P';
                } else {
                    column--;
                    map[column][row] = 'P';
                }

                break;

            case 'l':
                map[column][row] = ' ';
                row--;

                if (map[column][row] != 'X') {
                    map[column][row] = 'P';
                } else {
                    row++;
                    map[column][row] = 'P';
                }
                break;

            case 'u':
                map[column][row] = ' ';
                column--;

                if (map[column][row] != 'X') {
                    map[column][row] = 'P';
                } else {
                    column++;
                    map[column][row] = 'P';
                }
                break;

        }

    }
}
