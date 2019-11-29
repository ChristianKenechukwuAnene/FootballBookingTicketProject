//CHRISTIAN ANENE
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;

public class SeasonFixtures extends JFrame {//implements ActionListener {

static ArrayList<Fixtures> allFixtures = new ArrayList<Fixtures>();
static JButton b;
static JTextField matchField, dateField, timeField ;

  //JB added code below so that Arraylist could be accessed from other classes

    public static ArrayList<Fixtures> getAllFixtures()
    {
        return allFixtures;
    }

    public SeasonFixtures() {

        //code below added by JB for preliminary test of Fixtures class and associated allFixtures array

        allFixtures.add(new Fixtures("Vs Liverpool", "", ""));
        allFixtures.add(new Fixtures("Vs Man city","", "" ));
        allFixtures.add(new Fixtures("Arsenal","", ""));
        allFixtures.add(new Fixtures("Chelsea FC","", "" ));
        allFixtures.add(new Fixtures("Vs NewCastle", "", ""));
        allFixtures.add(new Fixtures("Vs WestHam FC", "", ""));
        allFixtures.add(new Fixtures("Leeds United", "", ""));
        allFixtures.add(new Fixtures("Watford", "", ""));

        for(Fixtures f: allFixtures)
        {
            System.out.println(f);
        }


        JFrame frame = new JFrame();
        frame.setLayout(null);

//For Positioning the Containers

//Labeling
        JLabel label = new JLabel("ADDING LATEST FIXTURE");
        JLabel match = new JLabel("MATCH:");
        JLabel date = new JLabel("DATE:");
        JLabel time = new JLabel("TIME");

//Setting SETBOUNDS or POSITION() Methods

        label.setBounds(150,10,220,20);
        match.setBounds(150,50,100,50);
        date.setBounds(150,90,100,50);
        time.setBounds(150,130,100,50);

//TextField
        matchField = new JTextField();
        dateField = new JTextField();
        timeField = new JTextField();

//Setting filed SETBOUNDS or POSITION() Methods

        matchField.setBounds(250,65,150,20);
        dateField.setBounds(250,105,80,20);
        timeField.setBounds(250,145,80,20);

//Button
       b = new JButton("Submit");

//setBounds for button
        b.setBounds(200,190,100,20);

//adding containers to JFRAME
        frame.add(label);
        frame.add(match);
        frame.add(matchField);
        frame.add(dateField);
        frame.add(date);
        frame.add(timeField);
        frame.add(time);
        frame.add(b);
        //setiing the content on the frame visiable
        frame.setVisible(true);
        frame.setSize(500,300);
        b.addActionListener(new ButtonEventHandler());

    }

    private static class ButtonEventHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //when submit button is pressed then you create a Fixtures object from the values in the text-feilds
            if (e.getSource()== b)
            {
               // Fixtures match = new Fixtures((String) matchField.getText(),
                String mtch="", dat ="",tim ="";
                mtch = matchField.getText();
                        dat = dateField.getText();
                        tim = timeField.getText();

               allFixtures.add(new Fixtures(mtch,dat,tim));
            }

            //now add the Fixtures object to the array list of Fixtures called allFixtures


            //the array list can then be used to populate the combo-box

        }
    }
}

