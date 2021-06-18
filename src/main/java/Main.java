
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        int width = 420;
        int height = 420;

        MyFrame frame = new MyFrame(width, height, "Trispalve");
        frame.setSize(height, width);
       // frame.setLayout(new GridLayout(3, 1, 0, 0));

        ImageIcon logo = new ImageIcon("src/main/zodiak-logo.png"); //create an ImageIcon
        frame.setIconImage(logo.getImage()); //change icon of frame

        // sukurti JPanel header
        JPanel header = new JPanel();
        header.setBackground(Color.decode("#556677"));
        header.setSize(width, height / 10);
        frame.add(header, BorderLayout.PAGE_START);

        // sukurti JPanel body
        JPanel body = new JPanel();
        body.setBackground(Color.decode("#445566"));
        body.setSize(width, height/3);
        frame.add(body, BorderLayout.CENTER);

        // sukurti JPanel footer
        JPanel footer = new JPanel();
        footer.setBackground(Color.decode("#335566"));
        footer.setSize(width,height/3);
        frame.add(footer, BorderLayout.PAGE_END);

        //frame.setVisible(true);

        //sukuriu input boxus
        JTextField inpBox1 = new JTextField("Year", 10);
        JTextField inpBox2 = new JTextField("Month", 10);
        JTextField inpBox3 = new JTextField("Day", 10);


        // input boxus pridedu prie header paneles

        header.add(inpBox1);
        header.add(inpBox2);
        header.add(inpBox3);

        //Sukuriu mygtukus

        JButton btnFind = new JButton("Find");
        JButton btnClear = new JButton("Clear");
        btnFind.setSize(width/3, height/10);
        btnClear.setSize(width/3, height/10);
        // mygtukus pridedu prie footer paneles

        footer.add(btnFind);
        footer.add(btnClear);

        frame.setVisible(true);
    }
}