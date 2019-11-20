import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class BookingDetails extends JFrame {

    String[] fixture =   {"Vs: Liverpool    2020-12-04   4:00pm","Vs: Manchester City   2020-15-04  12:30pm"," Vs: LiverPool FC   2020-15-04  5:00pm","Vs: Arsenal FC   2020-15-04  4:30pm" };
    String[] block =   {"W120","W121","W122","W123","W124","124"};
    String[] row =   {"010","011","012","013","014","015"};
    String[] seat =  {"S11","S12","S13","S14","S15","S16"};

    JFrame B;
    JLabel fixtureLabel=new JLabel("FIXTURE :");
    JLabel nameLabel=new JLabel("NAME");
    JLabel emailLabel=new JLabel("EMAIL");
    JLabel blockLabel=new JLabel("BLOCK");
    JLabel rowLabel=new JLabel("ROW");
    JLabel seatLabel=new JLabel("SEAT");

    JTextField nameTextField=new JTextField();
    JComboBox fixtureComboBox=new JComboBox(fixture);
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

        blockComboBox.setBounds(150,240,150,30);
        B.add(blockComboBox);
        blockLabel.setBounds(20,40,120,70);
        B.add(blockLabel);
        Font font = new Font("Verdana", Font.BOLD, 12);
        blockLabel.setFont(font);

        rowComboBox.setBounds(150,300,150,30);
        B.add(rowComboBox);

        seatComboBox.setBounds(150,360,150,30);
        B.add(seatComboBox);

    }




}