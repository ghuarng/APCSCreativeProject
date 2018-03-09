package com.alyssa;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.metal.MetalButtonUI;

public class Game extends JFrame implements ActionListener {
    public boolean inGame;
    final int X = 600, Y = 1024;

    private JFrame window;
    private JMenuBar mnuMain;
    private JMenuItem   mnuRestart, mnuGameTitle, mnuStartQuiz, mnuExit;


    private Font fontToken = new Font("Arial", Font.BOLD, 70);
    private Font fontRadio = new Font("Arial", Font.BOLD, 25);
    private Font fontMenu = new Font("Arial", Font.BOLD, 18);

    public void init() {
        inGame = false;

        window = new JFrame("|||||||||||||||||||REVENGERS REUNITE|||||||||||||||||||");

        mnuMain = new JMenuBar();
        mnuRestart = new JMenuItem("  TRY AGAIN");
        mnuGameTitle = new JMenuItem("QUIZ  ");
        mnuStartQuiz = new JMenuItem(" START QUIZ");
        mnuExit = new JMenuItem("    GIVE UP");

        window.setSize(X, Y);
        window.setLocation(300, 180);
        window.setResizable(true);
        window.setLayout(new BorderLayout());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        mnuMain.add(mnuGameTitle);
        mnuGameTitle.setEnabled(false);
        mnuGameTitle.setFont(fontMenu);
        mnuMain.add(mnuRestart);
        mnuRestart.setFont(fontMenu);
        mnuMain.add(mnuRestart);
        mnuRestart.setFont(fontMenu);
        mnuMain.add(mnuExit);
        mnuExit.setFont(fontMenu);

        // adding Action Listener to all the Buttons and Menu Items
        mnuRestart.addActionListener(this);
        mnuExit.addActionListener(this);
        mnuRestart.addActionListener(this);
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
