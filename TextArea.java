/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Asus
 */
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class TextArea {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Option Pane Text Area Example");

        final SpringLayout layout = new SpringLayout();

        final JPanel panel = new JPanel(layout);
        panel.setPreferredSize(new Dimension(250, 160));

        JLabel lblName = new JLabel("Name");
        panel.add(lblName);
        JTextField txtName = new JTextField(10);
        txtName.setBorder(BorderFactory.createLineBorder(Color.black));
        panel.add(txtName);

        JLabel lblAddress = new JLabel("Address");
        panel.add(lblAddress);
        JTextArea txtAddress = new JTextArea();
        txtAddress.setBorder(BorderFactory.createLineBorder(Color.black));
        txtAddress.setLineWrap(true);
        txtAddress.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(txtAddress,
                   JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
                   JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setPreferredSize(new Dimension(430, 250));
        panel.add(scrollPane);

        layout.putConstraint(SpringLayout.WEST, lblName,
                             0,
                             SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, lblAddress,
                             10,
                             SpringLayout.SOUTH, lblName);

        layout.putConstraint(SpringLayout.WEST, txtName,
                             25,
                             SpringLayout.EAST, lblName);
        layout.putConstraint(SpringLayout.NORTH, scrollPane,
                             10,
                             SpringLayout.SOUTH, lblAddress);


        int result = JOptionPane.showConfirmDialog(frame, panel,
                "Text Box and Text Area Example", JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE);

        if (result == JOptionPane.YES_OPTION) {
            System.out
                    .println(txtName.getText() + ",\n" + txtAddress.getText());
        } else {
            System.out.println("Canceled");
        }

        System.exit(0);
    }
}
