package designpattern.structural.proxy.virtualproxy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

public class ImgProxyDriveTest {

    ImageComponent imageComponent;

    public static void main(String[] args) {
        try {
            ImgProxyDriveTest imgProxyDriveTest = new ImgProxyDriveTest();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public ImgProxyDriveTest() throws Exception {

        JFrame frame = new JFrame();
        frame.setTitle("Virtual Proxy Pattern");

        JMenuBar jMenuBar = new JMenuBar();

        JMenuItem jMenuItem = new JMenuItem("Start");
        JMenu jMenu = new JMenu("Show me a cat");
        jMenu.add(jMenuItem);

        jMenuBar.add(jMenu);

        frame.setJMenuBar(jMenuBar);


        URL initURL =  new URL("http://www.cs.yale.edu/homes/freeman-elisabeth/2004/9/Oliver_sm.jpg");
        Random random = new Random();

        Icon icon = new ImageProxy(initURL);
        jMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button listener");
                imageComponent = new ImageComponent(icon);
                for (Component component : frame.getContentPane().getComponents()) {
                    ImageComponent a = (ImageComponent) component;
                    a.setIcon(icon);
                }
                frame.repaint();
            }
        });

        imageComponent = new ImageComponent(null);
        frame.getContentPane().add(imageComponent);

        frame.setResizable(true);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

    }
}
