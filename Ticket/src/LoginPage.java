//My package for booking Ticket Match Fixture

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LoginPage extends JFrame implements ActionListener{

    // private instance variables
    JLabel l1,lab,lab1;
    JTextField usernameField;
    JPasswordField passwordField;
    JPanel jpanel,jp;


    public static void main (String [] args) {
        LoginPage Ticket = new LoginPage();
        Ticket.setVisible(true);             }


    //setting up jframe window with all the Panels Button

    public LoginPage () {

        setTitle("KEECEE TICKETING");
        lab = new JLabel("LATEST FIXTURE");
        lab1 = new JLabel("02/20/2020");
        add(lab);
        add(lab1);
        setSize(400,300);
        setLayout(new FlowLayout());
        setVisible(true);
        Font font = new Font("Verdana", Font.BOLD, 25);
        lab.setFont(font);
        lab.setForeground(Color.DARK_GRAY);
        lab1.setForeground(Color.blue);

        // The Image Icon on The Panel
        JLabel l1 = new JLabel(new ImageIcon("C:\\Users\\User\\IdeaProjects\\FootballBookingTicketProject\\Ticket\\pix4.jpg"));
        add(l1, BorderLayout.CENTER);



//UserName and PassWord Panel Setup
        jpanel = new JPanel();
        jpanel.setLayout(new FlowLayout());
        // setSize(400,500);
        JLabel usernameLabel = new JLabel("Username:");
        jpanel.add(usernameLabel);
        usernameField = new JTextField(10);
        usernameField.setLocation(50, 85);
        jpanel.add(usernameField);
        JLabel passwordLabel = new JLabel("Password:");
        jpanel.add(passwordLabel);
        passwordField = new JPasswordField(10);
        jpanel.add(passwordField);
        jpanel.setVisible(true);
        add(jpanel, BorderLayout.SOUTH);


        TextFieldEventHandler handler = new TextFieldEventHandler();
        //must register an ActionListener for each field here
        usernameField.addActionListener(handler);
        passwordField.addActionListener(handler);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent event) {
        // add code to increment the buttonCount and display it on the button


    }

    private class TextFieldEventHandler implements ActionListener{
        public void actionPerformed(ActionEvent e)
        {
            //if the text-field triggered the event
            if(e.getSource() == usernameField)
            {
                //set the focus to the password field
                passwordField.requestFocus();
            }
            //if the password field triggered the event (this could be an if-else)
            if(e.getSource() == passwordField)
            {
                //interestingly, getPassword() returns a char[] rather than a String
                char[] passwordCharacters = passwordField.getPassword();

                //converting the char[] to a String
                String passwordText = new String(passwordCharacters);

                if(usernameField.getText().equals("Keecee") &&
                        passwordText.equals("123abc"))
                    JOptionPane.showMessageDialog(null,"Welcome to the system " +
                                    usernameField.getText(),"Authenticated",
                            JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog(null,"Invalid username/password " +
                            "combination","Not authenticated",JOptionPane.INFORMATION_MESSAGE);
            }

        }
    }

}
