import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BookingFrame extends JFrame implements ActionListener{
    // private instance variables
    JButton b1;
    JMenu fileMenu;


    public static void main (String [] args) {
        BookingFrame Ticket = new BookingFrame();
        Ticket.setVisible(true);
    }
            /**setting up frame window and Add the menubar**/
            public BookingFrame () {
                setTitle("KEECEE TICKETING");
               JLabel l1 = new JLabel(new ImageIcon("Ticket\\Apix.PNG"));
                add(l1, BorderLayout.CENTER);
                /**setting up the book now button on the frame**/
                JButton b1 = new JButton("Book Now");
                add(b1, BorderLayout.SOUTH);
               setResizable(false);
                setSize(500, 500);
                setVisible(true);

                //adding menubar on  the frame

                createFileMenu();
                JMenuBar filebar = new JMenuBar();
                setJMenuBar(filebar);
                add(filebar, BorderLayout.NORTH);
                filebar.setBackground(Color.gray);
                filebar.add(fileMenu);
                b1.addActionListener(this);
            }
    public void actionPerformed(ActionEvent event) {
        // add code to increment the buttonCount and display it on the button
        LoginPage Log = new LoginPage();
        Log.setVisible(true);
        setVisible(false);

        String  menuName;
        menuName = event.getActionCommand(); // what's written on the item that was clicked
        // note the String comparison
        if (menuName.equals("Quit")) {
            System.exit(0);
        }
         else if(menuName.equals("Latest Fixture")) {


            }
         // end if
    } // end actionPerformend

    /**  Creates File menu and its menu items */
    private void createFileMenu( ) {
        JMenuItem    item; // declare a re-usable JMenuItem object

        // first, create the menu: then you can start on the items
        fileMenu = new JMenu("File");

        // create the first item
        // make sure the program is listening for clicks: handle them in 'this' class
        item = new JMenuItem("Season Fixture..."); //Season Fixture...
        item.addActionListener( this );
        fileMenu.add( item );

        fileMenu.addSeparator();           //add a horizontal separator line

        item = new JMenuItem("Quit");       //Quit
        item.addActionListener( this );
        fileMenu.add( item );
    } // end createFileMenu


}

