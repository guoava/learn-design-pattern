package designpattern.behavioral.observer.test.jbutton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class JButtonTest {

    static JFrame jFrame;

    public static void main(String[] args) {
        try {
            JButtonTest jButtonTest = new JButtonTest();
            jButtonTest.go();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void go(){
        jFrame = new JFrame();


        JTextArea jTextArea = new JTextArea();
        jTextArea.setSize(600,200);
        jTextArea.setColumns(50);
        jTextArea.setRows(50);


        JButton jButton = new JButton("Should i do it ?");
        jButton.setSize(300,100);
        jButton.addActionListener(new AngelListener(jTextArea));
        jButton.addMouseWheelListener(new DevilListener(jTextArea));

        Container contentPane = jFrame.getContentPane();
        // Observer pattern
        // add two observers to observable
        contentPane.add(BorderLayout.WEST, jButton);
        contentPane.add(BorderLayout.EAST,jTextArea);

        jFrame.setSize(900,600);
        jFrame.setVisible(true);
    }
    class AngelListener implements ActionListener{

        JTextArea jTextArea;

        public AngelListener(JTextArea jTextArea){
            this.jTextArea = jTextArea;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don’t do it, you might regret it!");
            jTextArea.setText(jTextArea.getText()+"Don’t do it, you might regret it!\n");
        }
    }
    class DevilListener implements MouseWheelListener {

        JTextArea jTextArea;

        public DevilListener(JTextArea jTextArea){
            this.jTextArea = jTextArea;
        }

        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
            System.out.println("Come on, do it！");
            jTextArea.setText(jTextArea.getText()+"Come on, do it！\n");
        }
    }
}
