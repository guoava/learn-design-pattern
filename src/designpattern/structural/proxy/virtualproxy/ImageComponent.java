package designpattern.structural.proxy.virtualproxy;

import javax.swing.*;
import java.awt.*;

public class ImageComponent extends JComponent {

    private Icon icon;

    public ImageComponent(Icon icon) {
        this.icon = icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public void paintComponent(Graphics g) {
        if (icon != null) {
            System.out.println("start print image Component");
//            super.paintComponent(g);
            System.out.println("start print image icon");
            icon.paintIcon(this, g, icon.getIconWidth(), icon.getIconHeight());
        }
    }


}


