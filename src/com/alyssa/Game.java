 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.metal.MetalButtonUI;

public class Game extends JFrame implements ActionListener {
    public boolean inGame;
    final int X = 600, Y = 1024;

    private JFrame window;
    private JMenuBar mnuMain;
    private JMenuItem   mnuClearGame, mnuGameTitle, mnuStartGame, mnuExit;


    private Font fontToken = new Font("Arial", Font.BOLD, 70);
    private Font fontRadio = new Font("Arial", Font.BOLD, 25);
    private Font fontMenu = new Font("Arial", Font.BOLD, 18);

    public void init() {
        inGame = false;

        window = new JFrame("Your Mom's Tic Tac Toe Game");

        mnuMain = new JMenuBar();
        mnuClearGame = new JMenuItem("  Clear Game");
        mnuGameTitle = new JMenuItem("Tic Tac Toe  ");
        mnuStartGame = new JMenuItem(" Start Game");
        mnuExit = new JMenuItem("    Quit");

        window.setSize(X, Y);
        window.setLocation(300, 180);
        window.setResizable(true);
        window.setLayout(new BorderLayout());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public void actionPerformed(ActionEvent click) {
        // get the mouse click from the user
        Object source = click.getSource();

//        if (source == mnuClearGame) {
//            clearGame();
//        } else if (source == mnuExit) {
//            exitGame();
//        } else if (source == mnuStartGame) {
//            configureGame();
//        } else if (source == startGameButton) {
//            startGame();
//        } else if (click.getActionCommand() != "") {
//            String cmd = click.getActionCommand();
//            int player = cmd.charAt(1) - '0'; // convert player number to integer
//            String action = cmd.substring(2);
//            if (action.equals(dot)) {
//                if (player == 1) {
//                    p2Tri.setSelected(true);
//                } else {
//                    p1Tri.setSelected(true);
//                }
//            } else if (action.equals(tri)) {
//                if (player == 1) {
//                    p2Dot.setSelected(true);
//                } else {
//                    p1Dot.setSelected(true);
//                }
//            }
//        } else {
//            checkBoardClick(source);
//        }
    }
}
