 

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.metal.MetalButtonUI;

public class Game extends JFrame implements ActionListener {
    public boolean inGame;
    final int X = 600, Y = 750;

    private JFrame window;
    private JMenuBar mnuMain;
    private JButton startGameButton;
    private JLabel mainTitle1, mainTitle2, mainTitle3, mainTitle4;
    private JMenuItem   mnuClearQuiz, mnuGameTitle, mnuStartQuiz, mnuExit;

    JPanel pnlBar, pnlGame, pnlTitle, pnlTitlePicture, pnlTitlePage, pnlQuestion, pnlPicture, pnlAnswer;

    private Font fontToken = new Font("Impact", Font.BOLD, 70);
    private Font fontTitle = new Font("Impact", Font.BOLD, 100);
    private Font fontMenu = new Font("Impact", Font.BOLD, 18);

    public void init() {
        inGame = false;

        window = new JFrame("|||||||||||||||||||REVENGERS REUNITE|||||||||||||||||||");

        mnuMain = new JMenuBar();
        mnuGameTitle = new JMenuItem("HOME  ");
        mnuClearQuiz = new JMenuItem("  CLEAR QUIZ");
        mnuStartQuiz = new JMenuItem(" START QUIZ");
        mnuExit = new JMenuItem("    GIVE UP");

        pnlBar = new JPanel();
        pnlGame = new JPanel();
        pnlTitlePage = new JPanel();
        pnlQuestion = new JPanel();
        pnlPicture = new JPanel();
        pnlAnswer = new JPanel();
        pnlTitle = new JPanel();
        pnlTitlePicture = new JPanel();

        window.setSize(X, Y);
        window.setLocation(300, 180);
        window.setResizable(true);
        window.setLayout(new BorderLayout());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //start menu initialization
        mnuMain.add(mnuGameTitle);
        mnuGameTitle.setFont(fontMenu);
        mnuMain.add(mnuClearQuiz);
        mnuClearQuiz.setFont(fontMenu);
        mnuMain.add(mnuStartQuiz);
        mnuStartQuiz.setFont(fontMenu);
        mnuMain.add(mnuExit);
        mnuExit.setFont(fontMenu);
        // adding Action Listener to all the Buttons and Menu Items
        mnuClearQuiz.addActionListener(this);
        mnuExit.addActionListener(this);
        mnuClearQuiz.addActionListener(this);
        //adding menu to panel
        pnlBar.add(mnuMain);
        pnlBar.setBackground(new Color(75, 255, 0));
        //end menu initialization;

        //title page
        pnlTitlePage.setLayout(new GridLayout(X, Y - 180, 2, 2));
        pnlTitlePage.setBackground(new Color(69, 0, 54));
        mainTitle1 = new JLabel("wElCOmE");
        mainTitle1.setFont(fontTitle);
        pnlTitle.add(mainTitle1);
        mainTitle2 = new JLabel("tO ThE");
        mainTitle2.setFont(fontTitle);
        pnlTitle.add(mainTitle2);
        mainTitle3 = new JLabel("rEveNgErS");
        mainTitle3.setFont(fontTitle);
        pnlTitle.add(mainTitle3);
        mainTitle4 = new JLabel("QuIz");
        mainTitle4.setFont(fontTitle);
        pnlTitle.add(mainTitle4);
        pnlTitlePage.add(pnlTitle);
        startGameButton = new JButton("Start Game");
        startGameButton.setFont(fontTitle);
        startGameButton.addActionListener(this);
        pnlTitlePage.add(startGameButton);
        //end title page

        pnlGame.setLayout(new GridLayout(X, Y - 180, 2, 2));
        pnlGame.setBackground(new Color(103, 146, 108)); //background behind buttons

        goToTitle();

        window.add(pnlBar, BorderLayout.NORTH);
        window.add(pnlGame, BorderLayout.CENTER);
        window.setVisible(true);
    }

    public void actionPerformed(ActionEvent click) {
        // get the mouse click from the user
        Object source = click.getSource();
        if (source == mnuGameTitle) {
            goToTitle();
        } else if (source == mnuClearQuiz) {
            showGame();
            /*startGame();*/
        } else if (source == mnuExit) {
//            exitGame();
        } else if (source == mnuStartQuiz) {
            showGame();
            /*startGame();*/
        } else if (source == startGameButton) {
            showGame();
            // startGame();
        }
    }

    //methods for what the game will look like
    public void showTitlePage() {
        pnlGame.add(pnlTitlePage);
        pnlTitlePage.requestFocus();
        pnlGame.revalidate();
    }
    public void showGame() {
        pnlGame.remove(pnlTitlePage);
        window.add(pnlGame, BorderLayout.CENTER);
        pnlGame.setLayout(new BorderLayout());
        pnlGame.add(pnlQuestion, BorderLayout.NORTH);
        pnlGame.add(pnlPicture, BorderLayout.CENTER);
        pnlGame.add(pnlAnswer, BorderLayout.SOUTH);
        pnlQuestion.requestFocus();
        pnlPicture.requestFocus();
        pnlAnswer.requestFocus();
    }
    private void goToTitle() {
        pnlGame.remove(pnlQuestion);
        pnlGame.remove(pnlPicture);
        pnlGame.remove(pnlAnswer);
        showTitlePage();
        //enableBoard(false);
    }
}
