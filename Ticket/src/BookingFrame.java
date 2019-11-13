import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BookingFrame extends JFrame implements ActionListener{
    // private instance variables
    JButton b1;


    public static void main (String [] args) {
        BookingFrame Ticket = new BookingFrame();
        Ticket.setVisible(true);
    }

            //setting up jframe window
            public BookingFrame () {

                setTitle("KEECEE TICKETING");
                JLabel l1 = new JLabel(new ImageIcon("C:\\Users\\t00204290\\IdeaProjects\\FootballBookingTicketProject\\Ticket\\Apix.PNG"));
                add(l1, BorderLayout.CENTER);

                JButton b1 = new JButton("Book Now");
                add(b1, BorderLayout.SOUTH);

                setSize(500, 500);
                setVisible(true);

                b1.addActionListener(this);
            }
    public void actionPerformed(ActionEvent event) {
        // add code to increment the buttonCount and display it on the button
        LoginPage Log = new LoginPage();
        Log.setVisible(true);
        setVisible(false);
    }
    }
