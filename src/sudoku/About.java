package sudoku;
import javax.swing.*;

public class About extends JFrame {
    public About() {
        setSize(200, 400);
        setLocationRelativeTo(null);


        JLabel label = new JLabel("<html><br><center>Sudoku Game</center><br><center>Developed by Group 11:</center><br>"
                + "<center>5026221009 - Indriyani Alif Safitri</center>"
                + "<center>5026221116 - Athaalla Rayya Genaro Iswandoko</center>"
                + "<center>5026221127 - Mochammad Afandi Wirawan</center>"
                + "<center>5026221197 - Hajid Alauddin Ramadhan</center><br>"
                + "<center>©️ Final Project ASD A 2023/2024</center></html>");

        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setIconTextGap(10);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        add(label);
        setTitle("About");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}