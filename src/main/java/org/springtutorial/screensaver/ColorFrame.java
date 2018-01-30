package org.springtutorial.screensaver;

import org.springframework.stereotype.Component;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.HeadlessException;
import java.util.Random;

@Component
public abstract class ColorFrame extends JFrame {

    // @Autowired
    // private Color color;

    // Wrong case!
    // @Autowired
    // private ApplicationContext context;

    public ColorFrame() throws HeadlessException {
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void showOnRandomPlace() {
        Random random = new Random();
        setLocation(random.nextInt(1200), random.nextInt(700));
        getContentPane().setBackground(getColor());
        // getContentPane().setBackground(context.getBean(Color.class)); // Wrong case!
        repaint();
    }

    public abstract Color getColor();
}
