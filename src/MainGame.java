import javax.swing.*;
public class MainGame {
    public static void main(String[] args) {

        do {
            BeginGame.startGame();
            PlayerOneSelection.Player1Selection();
            GameRules.playGame();
        }
        // added a do while function to rerun the whole thing if user selects new game
        while (BeginGame.startGameOption == 1);
    }
}
