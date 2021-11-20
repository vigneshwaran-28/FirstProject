package atm;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vignesh
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class FetchData implements ActionListener {
 int DummyAccNum;
    JFrame frame1;//creating object of first JFrame
    JLabel nameLabel;//creating object of JLabel
    JTextField nameTextField;//creating object of JTextfield
    JButton fetchButton;//creating object of JButton
    JButton resetButton;//creating object of JButton

    JFrame frame2;//creating object of second JFrame
    DefaultTableModel defaultTableModel;//creating object of DefaultTableModel
    JTable table;//Creating object of JTable
    Connection connection;//Creating object of Connection class
    Statement statement;//Creating object of Statement class
    int flag = 0;

    public static void main(String[] args) {
        new FetchData(0);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    // public void frameSecond(int MyAccNum) {
    FetchData(int MyAccNum) {
        this.DummyAccNum=MyAccNum;
        //setting the properties of second JFrame
        frame2 = new JFrame("Database Results");
        JButton back = new JButton("back");
         frame2.add(back);
      // JPanel addPanel = new JPanel();
       
        back.setBounds(60, 400, 220, 30);
      //  addPanel.setLayout(new BorderLayout());
//addPanel.add(back,BorderLayout.SOUTH);
       
//back.add(addPanel);
 //back.setLayout(new GridLayout(1,3,150,0));
        back.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                frame2.setVisible(false);
                 new MainMenu().setVisible(true);
            }
        });
        
        frame2.setLayout(new FlowLayout());
        frame2.setSize(1500, 1500);

        //Setting the properties of JTable and DefaultTableModel
        defaultTableModel = new DefaultTableModel();
        table = new JTable(defaultTableModel);
        table.setPreferredScrollableViewportSize(new Dimension(1000, 1000));
        table.setFillsViewportHeight(true);
        frame2.add(new JScrollPane(table));
        defaultTableModel.addColumn("Id");
        defaultTableModel.addColumn("AccountNum");
        defaultTableModel.addColumn("Type");
        defaultTableModel.addColumn("Date");
        defaultTableModel.addColumn("Amount");
        try {
            MyAccNum = 1001;
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb", "root", "");//Crating connection with database
            statement = connection.createStatement();//crating statement object
            String query = "Select * from sample where accountnum=" + MyAccNum;//Storing MySQL query in A string variable
            ResultSet resultSet = statement.executeQuery(query);//executing query and storing result in ResultSet

            int count = 1;
            while (resultSet.next()) {

                //Retrieving details from the database and storing it in the String variables
                //    int id = resultSet.getInt("id");
                int id = count++;
                int accnum = resultSet.getInt("accountnum");
                String type = resultSet.getString("type");
                String date = resultSet.getString("date");
                int amount = resultSet.getInt("amount");
                if (MyAccNum == accnum) {
                    flag = 1;
                    defaultTableModel.addRow(new Object[]{id, accnum, type, date, amount});//Adding row in Table
                    frame2.setVisible(true);//Setting the visibility of second Frame
                    frame2.validate();
                    //  break;
                }
            }

            if (flag == 0) {
                JOptionPane.showMessageDialog(null, "No Such Username Found");//When invalid username is entered
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
