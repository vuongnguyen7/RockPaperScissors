import javax.swing.*;

// declare a value for when we check whether user wants to start a new game

public class BeginGame {
    public static int startGameOption = 1;
    public static String[] beginGameOptions = new String[]{"Exit", "New Game"};

    public static void startGame() {
        // create a dialog box with options using the array just above
        startGameOption = JOptionPane.showOptionDialog(null, "Hello, welcome to the 'Rock, Paper, Scissors' game", "Rock, Paper, Scissor Game",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, beginGameOptions,null);

        // where response is 0 when user clicks exit button, -1 for close x button or Esc key. In all these incidences, the game will close.
        if (startGameOption == 0 || startGameOption == -1) {
            System.exit(0);
        }
    }
}
