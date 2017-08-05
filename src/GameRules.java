import javax.swing.*;

public class GameRules {

    // declaring variables for player scores to be 0 at the start of the game
    static int currentPlayerOneScore = 0;
    static int currentPlayerTwoScore = 0;

    static void playGame() {
        // since player 2 will always be computer, assign player2choice using a random generator to select a value from the gameChoices array defined above
        String player2choice = PlayerOneSelection.gameChoices[(int) Math.floor(Math.random() * 3)];
        // use a switch function based on player 1's choices and using multiple if statements based on the rules
        switch (PlayerOneSelection.player1Choice) {
            // using all the cases that player 1 can choose, here we look at when player 1 selects Rock.
            case "Rock":
                if (player2choice == "Rock") {
                       /*
                       created dialog boxes with lots of information but adding new lines to make it more readable.
                       Also no scores to update when its a tie.
                       */
                    JOptionPane.showMessageDialog(null, GameMessages.player1And2Selected + player2choice + "." + "\n" + GameMessages.draw, "Game results", JOptionPane.PLAIN_MESSAGE, null);
                } else if (player2choice == "Scissors") {
                    JOptionPane.showMessageDialog(null, GameMessages.player1Selected + PlayerOneSelection.player1Choice + "." + "\n" + GameMessages.player2Selected + player2choice + "." + "\n" + GameMessages.rockScissors + GameMessages.player1Win, "Game results", JOptionPane.PLAIN_MESSAGE, null);
                    // updating player 1's score in this scenario
                    currentPlayerOneScore++;
                } else if (player2choice == "Paper") {
                    JOptionPane.showMessageDialog(null, GameMessages.player1Selected + PlayerOneSelection.player1Choice + "." + "\n" + GameMessages.player2Selected + player2choice + "." + "\n" + GameMessages.paperRock + GameMessages.player2Win, "Game results", JOptionPane.PLAIN_MESSAGE, null);
                    // updating player 2's score in this scenario
                    currentPlayerTwoScore++;
                }
                break;
            // repeating same checks for when player 1 has selected Paper
            case "Paper":
                if (player2choice == "Paper") {
                    JOptionPane.showMessageDialog(null, GameMessages.player1And2Selected + player2choice + "." + "\n" + GameMessages.draw, "Game results", JOptionPane.PLAIN_MESSAGE, null);
                } else if (player2choice == "Rock") {
                    JOptionPane.showMessageDialog(null, GameMessages.player1Selected + PlayerOneSelection.player1Choice + "." + "\n" + GameMessages.player2Selected + player2choice + "." + "\n" + GameMessages.paperRock + GameMessages.player1Win, "Game results", JOptionPane.PLAIN_MESSAGE, null);
                    currentPlayerOneScore++;
                } else if (player2choice == "Scissors") {
                    JOptionPane.showMessageDialog(null, GameMessages.player1Selected + PlayerOneSelection.player1Choice + "." + "\n" + GameMessages.player2Selected + player2choice + "." + "\n" + GameMessages.scissorsPaper + GameMessages.player2Win, "Game results", JOptionPane.PLAIN_MESSAGE, null);
                    currentPlayerTwoScore++;
                }
                break;
            // repeating same checks for when player 1 has selected Scissors
            case "Scissors":
                if (player2choice == "Scissors") {
                    JOptionPane.showMessageDialog(null, GameMessages.player1And2Selected + player2choice + "." + "\n" + GameMessages.draw, "Game results", JOptionPane.PLAIN_MESSAGE, null);
                } else if (player2choice == "Paper") {
                    JOptionPane.showMessageDialog(null, GameMessages.player1Selected + PlayerOneSelection.player1Choice + "." + "\n" + GameMessages.player2Selected + player2choice + "." + "\n" + GameMessages.scissorsPaper + GameMessages.player1Win, "Game results", JOptionPane.PLAIN_MESSAGE, null);
                    currentPlayerOneScore++;
                } else if (player2choice == "Rock") {
                    JOptionPane.showMessageDialog(null, GameMessages.player1Selected + PlayerOneSelection.player1Choice + "." + "\n" + GameMessages.player2Selected + player2choice + "." + "\n" + GameMessages.rockScissors + GameMessages.player2Win, "Game results", JOptionPane.PLAIN_MESSAGE, null);
                    currentPlayerTwoScore++;
                }
                break;
        }
        // dialog box to show current scores for player 1 and player 2
        JOptionPane.showMessageDialog(null, "Player 1 Score = " + currentPlayerOneScore + ". " + "\n" + "Player 2 Score = " + currentPlayerTwoScore + ".", "Current Scores", JOptionPane.PLAIN_MESSAGE, null);
    }
}
