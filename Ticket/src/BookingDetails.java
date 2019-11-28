import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import java.util.ArrayList;

public class BookingDetails extends JFrame implements ActionListener{

    String[] fixture =   {"Vs: Liverpool    2020-12-04   4:00pm","Vs: Manchester City   2020-15-04  12:30pm"," Vs: LiverPool FC   2020-15-04  5:00pm","Vs: Arsenal FC   2020-15-04  4:30pm" };
    String[] block =   {"W120","W121","W122","W123","W124","124"};
    String[] row =   {"010","011","012","013","014","015"};
    String[] seat =  {"S11","S12","S13","S14","S15","S16"};

    //access the arraylist of all fixtures here
    static ArrayList<Fixtures> allFixtures = new ArrayList<Fixtures>();

    //create an empty String array called "fixtures" to hold the individual fixture details
    String fixtures[];

    //now write a for loop to populate the String array with the contents of the array list
   // for(int i=0; i<fixture.();i++){

   // }


    JFrame B;
    JLabel fixtureLabel=new JLabel("FIXTURE :");
    JLabel nameLabel=new JLabel("NAME :");
    JLabel emailLabel=new JLabel("EMAIL :");
    JLabel blockLabel=new JLabel("BLOCK :");
    JLabel rowLabel=new JLabel("ROW :");
    JLabel seatLabel=new JLabel("SEAT :");
    JButton registerButton=new JButton("REGISTER");
    JButton resetButton=new JButton("RESET");

    JTextField nameTextField=new JTextField();
    JComboBox fixtureComboBox=new JComboBox(fixtures);
    JTextField emailTextField=new JTextField();
    JComboBox blockComboBox=new JComboBox(block);
    JComboBox rowComboBox=new JComboBox(row);
    JComboBox seatComboBox=new JComboBox(seat);




    //Creating constructor
    public static void main(String []args){
        BookingDetails Book = new BookingDetails();

    }

    public BookingDetails()
    {
        JFrame B = new JFrame();
        B.setTitle("BookingDetails Form");
        B.setBounds(40,40,500,600);
        B.getContentPane().setBackground(new Color(250,50,50));
        B.getContentPane().setLayout(null);
        B.setVisible(true);
        B.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        B.setResizable(false);

        // setLocationAndSize
        fixtureComboBox.setBounds(150,40,250,30);
        B.add(fixtureComboBox);
        fixtureLabel.setBounds(20,40,70,30);
        B.add(fixtureLabel);
        Font font = new Font("Verdana", Font.BOLD, 12);
        fixtureLabel.setFont(font);
        fixtureLabel.setForeground(Color.white);

        blockComboBox.setBounds(150,240,150,30);
        B.add(blockComboBox);
        blockLabel.setBounds(20,240,120,40);
        B.add(blockLabel);
        blockLabel.setFont(font);
        blockLabel.setForeground(Color.white);

        emailTextField.setBounds(150,180,250,30);
        B.add(emailTextField);
        emailLabel.setBounds(20,180,150,40);
        B.add(emailLabel);
        emailLabel.setFont(font);
        emailLabel.setForeground(Color.white);

        nameTextField.setBounds(150,100,250,30);
        B.add(nameTextField);
        nameLabel.setBounds(20,100,120,40);
        B.add(nameLabel);
        nameLabel.setFont(font);
        nameLabel.setForeground(Color.white);

        rowComboBox.setBounds(150,300,150,30);
        B.add(rowComboBox);
        rowLabel.setBounds(20,300,120,40);
        B.add(rowLabel);
        rowLabel.setFont(font);
        rowLabel.setForeground(Color.white);

        seatComboBox.setBounds(150,360,150,30);
        B.add(seatComboBox);
        seatLabel.setBounds(20,360,120,40);
        B.add(seatLabel);
        seatLabel.setFont(font);
        seatLabel.setForeground(Color.white);

        registerButton.setBounds(70,450,100,35);
        B.add(registerButton);
        resetButton.setBounds(280,450,100,35);
        B.add(resetButton);

        registerButton.addActionListener(this);
         resetButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== registerButton)
        {
        BookingD Book = new BookingD((String)fixtureComboBox.getSelectedItem(),
                nameTextField.getText(),
                emailTextField.getText(),
                (String)blockComboBox.getSelectedItem(),
                (String)rowComboBox.getSelectedItem(),
                (String)seatComboBox.getSelectedItem());
        JOptionPane.showMessageDialog(null,Book.toString());}

        else {

        }

    }


}