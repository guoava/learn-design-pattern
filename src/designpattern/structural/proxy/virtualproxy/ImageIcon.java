package designpattern.structural.proxy.virtualproxy;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.net.URL;

public class ImageIcon implements Icon {

    String iconName;
    URL imageURL;

    public ImageIcon(URL imageURL, String iconName) {
        this.imageURL = imageURL;
        this.iconName = iconName;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.drawString("mi ao ~", x + 30, y + 30);
        BufferedImage bufferedImage = null;
        try {
            bufferedImage = ImageIO.read(imageURL);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        g.drawImage(bufferedImage, 30, 40, null);
    }

    @Override
    public int getIconWidth() {
        return 0;
    }

    @Override
    public int getIconHeight() {
        return 0;
    }
}
