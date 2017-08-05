import javax.swing.*;

public class PlayerOneSelection {
    // create a new array with the possible choices so we can use later
    static String[] gameChoices = {"Rock", "Paper", "Scissors"};
    // declare some random value for a variable to hold response if user has selected player 1 as Human
    static int humanSelection = 5;
    // declare String player1's choice so we can use it later
    static String player1Choice = "Paper";

    static void Player1Selection() {

        while (humanSelection == 5) {
                       /*
                       if human then gives user the options that they can select for the game.
                       Where response is 0 for Rock, 1 for Paper, 2 for Scissors and -1 for Esc key or clicking close icon
                       */
            humanSelection = JOptionPane.showOptionDialog(null, "Please select one.", "Choices for Player 1",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                    null, gameChoices,null);
            if (humanSelection == 0) {
                // assign player1 value to be what user has selected, repeating for each option
                player1Choice = "Rock";
            } else if (humanSelection == 1) {
                player1Choice = "Paper";
            } else if (humanSelection == 2) {
                player1Choice = "Scissors";
            } else {
                // if user clicks the close box on the player 1 choices (Rock, Paper or Scissors) dialog box then the game closes
                System.exit(0);
            }
        }
                /* reset these variables so that the while loops (at line 42 and line 62) will re-execute and same code is run again if
           user was to select a new game */
        humanSelection = 5;
    }
}
