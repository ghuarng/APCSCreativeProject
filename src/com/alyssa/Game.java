package com.alyssa;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.metal.MetalButtonUI;

public class Game extends JFrame implements ActionListener {


    public void init() {

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
