import javax.swing.*;

public class GameRules {

    // declaring variables for player scores to be 0 at the start of the game
    static int currentPlayerOneScore = 0;
    static int currentPlayerTwoScore = 0;

    static void playGame() {
        // since player 2 will always be computer, assign player2choice using a random generator to select a value from the gameChoices array defined above
        String playerTwoChoice = PlayerOneSelection.gameChoices[(int) Math.floor(Math.random() * 3)];
        // use a switch function based on player 1's choices and using multiple if statements based on the rules
        switch (PlayerOneSelection.playerOneChoice) {
            // using all the cases that player 1 can choose, here we look at when player 1 selects Rock.
            case "Rock":
                if (playerTwoChoice == "Rock") {
                       /*
                       created dialog boxes with lots of information but adding new lines to make it more readable.
                       Also no scores to update when its a tie.
                       */
                    JOptionPane.showMessageDialog(null, GameMessages.playerOneAndTwoSelected + playerTwoChoice + ". \n" + GameMessages.draw, "Game results", JOptionPane.PLAIN_MESSAGE, null);
                } else if (playerTwoChoice == "Scissors") {
                    JOptionPane.showMessageDialog(null, GameMessages.playerOneSelected + PlayerOneSelection.playerOneChoice + ". \n" + GameMessages.playerTwoSelected + playerTwoChoice + ". \n" + GameMessages.rockScissors + GameMessages.playerOneWins, "Game results", JOptionPane.PLAIN_MESSAGE, null);
                    // updating player 1's score in this scenario
                    currentPlayerOneScore++;
                } else if (playerTwoChoice == "Paper") {
                    JOptionPane.showMessageDialog(null, GameMessages.playerOneSelected + PlayerOneSelection.playerOneChoice + ". \n" + GameMessages.playerTwoSelected + playerTwoChoice + ". \n" + GameMessages.paperRock + GameMessages.playerTwoWins, "Game results", JOptionPane.PLAIN_MESSAGE, null);
                    // updating player 2's score in this scenario
                    currentPlayerTwoScore++;
                }
                break;
            // repeating same checks for when player 1 has selected Paper
            case "Paper":
                if (playerTwoChoice == "Paper") {
                    JOptionPane.showMessageDialog(null, GameMessages.playerOneAndTwoSelected + playerTwoChoice + ". \n" + GameMessages.draw, "Game results", JOptionPane.PLAIN_MESSAGE, null);
                } else if (playerTwoChoice == "Rock") {
                    JOptionPane.showMessageDialog(null, GameMessages.playerOneSelected + PlayerOneSelection.playerOneChoice + ". \n" + GameMessages.playerTwoSelected + playerTwoChoice + ". \n" + GameMessages.paperRock + GameMessages.playerOneWins, "Game results", JOptionPane.PLAIN_MESSAGE, null);
                    currentPlayerOneScore++;
                } else if (playerTwoChoice == "Scissors") {
                    JOptionPane.showMessageDialog(null, GameMessages.playerOneSelected + PlayerOneSelection.playerOneChoice + ". \n" + GameMessages.playerTwoSelected + playerTwoChoice + ". \n" + GameMessages.scissorsPaper + GameMessages.playerTwoWins, "Game results", JOptionPane.PLAIN_MESSAGE, null);
                    currentPlayerTwoScore++;
                }
                break;
            // repeating same checks for when player 1 has selected Scissors
            case "Scissors":
                if (playerTwoChoice == "Scissors") {
                    JOptionPane.showMessageDialog(null, GameMessages.playerOneAndTwoSelected + playerTwoChoice + ". \n" + GameMessages.draw, "Game results", JOptionPane.PLAIN_MESSAGE, null);
                } else if (playerTwoChoice == "Paper") {
                    JOptionPane.showMessageDialog(null, GameMessages.playerOneSelected + PlayerOneSelection.playerOneChoice + ". \n" + GameMessages.playerTwoSelected + playerTwoChoice + ". \n" + GameMessages.scissorsPaper + GameMessages.playerOneWins, "Game results", JOptionPane.PLAIN_MESSAGE, null);
                    currentPlayerOneScore++;
                } else if (playerTwoChoice == "Rock") {
                    JOptionPane.showMessageDialog(null, GameMessages.playerOneSelected + PlayerOneSelection.playerOneChoice + ". \n" + GameMessages.playerTwoSelected + playerTwoChoice + ". \n" + GameMessages.rockScissors + GameMessages.playerTwoWins, "Game results", JOptionPane.PLAIN_MESSAGE, null);
                    currentPlayerTwoScore++;
                }
                break;
        }
        // dialog box to show current scores for player 1 and player 2
        JOptionPane.showMessageDialog(null, "Player 1 Score = " + currentPlayerOneScore + ". " + "\n" + "Player 2 Score = " + currentPlayerTwoScore + ".", "Current Scores", JOptionPane.PLAIN_MESSAGE, null);
    }
}
