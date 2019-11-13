//My package for booking Ticket Match Fixture
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage extends JFrame implements ActionListener{
    // private instance variables
    JButton b1;
    JLabel l1, lab,lab1;

    public static void main (String [] args) {
        LoginPage Ticket = new LoginPage();
        Ticket.setVisible(true);
    }

    //setting up jframe window
    public LoginPage () {

        setTitle("KEECEE TICKETING");
        lab = new JLabel("     LATEST FIXTURE");
        lab1 = new JLabel("     20/12/2019");
        JLabel l1 = new JLabel(new ImageIcon("C:\\Users\\t00204290\\IdeaProjects\\FootballBookingTicketProject\\Ticket\\pix4.jpg"));
        add(l1, BorderLayout.CENTER);

        JButton b1 = new JButton("login");
        add(b1, BorderLayout.SOUTH);
        add(lab,BorderLayout.PAGE_START);
        add(lab1,BorderLayout.NORTH);

        Font font = new Font("Verdana", Font.BOLD, 25);
        lab.setFont(font);
        lab.setForeground(Color.DARK_GRAY);
        setSize(350, 500);
        setVisible(true);

        Font f = new Font("Verdana", Font.BOLD, 25);
        lab1.setFont(font);
        lab1.setForeground(Color.BLUE);
        setSize(350, 500);
        setVisible(true);

        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent event) {
        // add code to increment the buttonCount and display it on the button

    }
}
