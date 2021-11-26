package doublecolorqiu;

import java.awt.Color;

import javax.swing.JFrame;


public class myground {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("双色球");
        jFrame.setBounds(0, 0, 800, 600);
        jFrame.setVisible(true);
        myback myback = new myback();
        jFrame.setDefaultCloseOperation(3);
        jFrame.add(myback);

    }
}
