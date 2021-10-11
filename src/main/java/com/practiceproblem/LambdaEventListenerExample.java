package com.practiceproblem;

import javax.swing.*;

public class LambdaEventListenerExample {
    public static void main(String[] args) {
        JTextField tf=new JTextField();
        tf.setBounds(120, 120,250,30);
        JButton b=new JButton("click");
        b.setBounds(200,200,100,40);

        // lambda expression implementing here.
        b.addActionListener(e-> {tf.setText("Sameer");});

        JFrame f=new JFrame();
        f.add(tf);f.add(b);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(500, 350);
        f.setVisible(true);

    }
}
