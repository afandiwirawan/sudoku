package sudoku;
import java.awt.*;
import javax.swing.*;

public class SudokuMain extends JFrame {
    private static final long serialVersionUID = 1L;  // to prevent serial warning

    // private variables
    GameBoardPanel board = new GameBoardPanel();
    JButton btnNewGame = new JButton("New Game");
    JButton btnRestart = new JButton("Restart"); // New button for restart

    // Constructor
    public SudokuMain() {
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        cp.add(board, BorderLayout.CENTER);

        // Add buttons to the south to re-start the game via board.newGame() and restart
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnNewGame);
        buttonPanel.add(btnRestart);
        cp.add(buttonPanel, BorderLayout.SOUTH);

        // Add ActionListener for New Game button
        btnNewGame.addActionListener(e -> board.newGame());

        // Add ActionListener for Restart button
        btnRestart.addActionListener(e -> restartGame());

        // Initialize the game board to start the game
        board.newGame();

        pack();     // Pack the UI components, instead of using setSize()
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // to handle window-closing
        setTitle("Sudoku");
        setVisible(true);
    }

    // Method to restart the game
    private void restartGame() {
        board.newGame(); // Call the newGame method on button click
        JOptionPane.showMessageDialog(this, "Game Restarted!");
    }

    /** The entry main() entry method */
    public static void main(String[] args) {
        // Run GUI codes in the Event-Dispatching thread for thread safety
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SudokuMain();  // Let the constructor do the job
            }
        });
    }
}
