import java.lang.reflect.Array;
import java.util.Arrays;
import java.io.*;
import javax.imageio.*;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.*;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws IOException {
        


        JFrame window = new JFrame("Maxcraft");
        window.setSize(800, 800);
        window.setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );

        BufferedImage img = ImageIO.read(new File("items/minecraft_crafting_table.png"));
        JLabel icon = new JLabel( new ImageIcon(img) );
        // icon.setSize(500, 500);
        icon.setHorizontalAlignment(JLabel.CENTER);
        icon.setVerticalAlignment(JLabel.CENTER);

        window.add(icon);



        window.setVisible(true);

    }
}