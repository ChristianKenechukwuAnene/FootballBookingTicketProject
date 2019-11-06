import javax.swing.*;
import java.awt.*;

public class  BookingFrame {
    public static void main(String[] args ) {

        //setting up jframe window
        JFrame frame = new JFrame();
        frame.setTitle("KEECEE TICKETING");
        JLabel l1 = new JLabel(new ImageIcon("C:\\Users\\t00204290\\IdeaProjects\\FootballBookingTicketProject\\Ticket\\Apix.PNG"));
        frame.add(l1,BorderLayout.CENTER);

        JButton b1 = new JButton("Book Now");
        frame.add(b1,BorderLayout.SOUTH);

        frame.setSize(500, 500);
        frame.setVisible(true);

    }
    }
