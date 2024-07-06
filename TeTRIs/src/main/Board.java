/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import javax.sound.sampled.Clip;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author triho
 */
public class Board extends JPanel implements KeyListener, MouseListener, MouseMotionListener {

    private static final long serialVersionUID = 1L;

    private Clip music;

    private BufferedImage blocks, background, pause, refresh;
    // Playing Area
    private final int boardHeight = 20, boardWidth = 10;
    // Block Size
    private final int blockSize = 30;
    // field
    private int[][] board = new int[boardHeight][boardWidth];
    // array with all the possible shapes
    private Shape[] shapes = new Shape[7];
    // currentShape
    private static Shape currentShape, nextShape;
    //gameLoop
    private Timer looper;

    private int FPS = 60;

    private int delay = 1000 / FPS;

    //mouseEvents
    private int mouseX, mouseY;

    private boolean leftClick = false;

    private Rectangle stopBounds, refreshBounds;

    private boolean gamePaused = false;

    private boolean gameOver = false;

    //button press lapse
    private Timer buttonLapse = new Timer(300, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            buttonLapse.stop();
        }
    });
    private int score = 0;

    public Board() {
 mouseX = 0;
 mouseY =0;
 
 stopBounds = new Rectangle(350, 500, pause.getWidth(), pause.getHeight() + pause.getHeight()/2);
 refreshBounds = new Rectangle(350, 500 - refresh.getHeight() - 20, refresh.getWidth(), refresh.getHeight() + refresh.getHeight()/2);
 
 // create game looper
 
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
