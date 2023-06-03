package com.jdbc.practice;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DisplayImage extends JFrame {
    private JTextField field;
    private JButton Button;
    private JLabel ImageLabel;
    private JPanel panel;


    public DisplayImage() {
        Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str=field.getText().trim();
                int id=Integer.parseInt(str);

                ImageIcon icon=Helper.getImageIconById(id,ConnectionProvider.getConnection());
                if(icon==null){
                    JOptionPane.showMessageDialog(null,"no image is found of your id");

                }
                else{
                    ImageLabel.setIcon(icon);
                }
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static void main(String[] args) {
        DisplayImage im=new DisplayImage();
        im.setContentPane(im.panel);
        im.setVisible(true);
        im.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    }
}

